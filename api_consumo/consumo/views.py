from django.http import HttpResponse
from rest_framework import viewsets
from rest_framework.request import Request
from rest_framework.decorators import action
import json
import requests

from consumo.models import Category

class CategoryView(viewsets.ViewSet):

    
    @action(detail=False, methods=['get'])
    def test1(self, request: Request, *args, **kwargs):
        
        # realizar la consulta a la API externa
        response = requests.get("http://localhost:8001/api/category/1/", headers={"Content-Type": "application/json"})
        data = response.json()
        category= Category(data['name'])
        print(category.name)
        
        catjson = json.dumps(category.__dict__)
        print(catjson)
        # si la consulta fue exitosa, devolver la respuesta en formato JSON
        if response.status_code == 200:
            response = HttpResponse(catjson, content_type="application/json")
            return response
        else:
            # si hubo un error en la consulta, devolver un mensaje de error
            return HttpResponse("Error en la consulta a la API externa", status=500)
       