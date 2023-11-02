################################################################################
#     ____                          __     _                          ___
#    / __ \  __  __  ___    _____  / /_   (_)  ____    ____          <  /
#   / / / / / / / / / _ \  / ___/ / __/  / /  / __ \  / __ \         / / 
#  / /_/ / / /_/ / /  __/ (__  ) / /_   / /  / /_/ / / / / /        / /  
#  \___\_\ \__,_/  \___/ /____/  \__/  /_/   \____/ /_/ /_/        /_/   
#                                                                        
#  Question 1
################################################################################
#
# Instructions:
# The two functions below are used to tell the weather. They have some bugs that
# need to be fixed. The test suite in `question1_test.py` will verify the output.
# Read the test suite to know the values that these functions should return.

def get_city_temperature(city):

  city_data = {
    "Quito": 22,
    "Sao Paulo": 17,
    "New York": 14,
  }

  return city_data[city]

def get_city_weather(city):

  city_data = {
    "Quito": "sunny",
    "Sao Paulo": "cloudy",
    "New York": "rainy",
  }

  temperature = get_city_temperature(city)
  weather = city_data[city]

  return f"{temperature} degrees and {weather}"
