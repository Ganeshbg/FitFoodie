from django.conf.urls import url
from . import views

urlpatterns=[
	url('signup',views.signup, name='signup'),
	url('signin',views.signin, name='signin'),
]

