from rest_framework.routers import DefaultRouter
from consumo.views import CategoryView

router = DefaultRouter()


router.register('api/category', CategoryView, basename='category')

urlpatterns = []

urlpatterns += router.urls
