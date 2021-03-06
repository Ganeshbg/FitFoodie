from django.shortcuts import render
from django.http import HttpResponse
from django.template import loader
from django.views.decorators.csrf import csrf_exempt

# Create your views here.

@csrf_exempt
def home(request):
    template = loader.get_template('users/signup.html')
    return HttpResponse(template.render(request))
