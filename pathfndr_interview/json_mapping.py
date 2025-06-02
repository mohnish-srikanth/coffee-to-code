# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
import json

def dict_array(input_json):
    items = input_json.items()
    for elem in items:
        print("key = " + str(elem[0]) + ", value = " + str(elem[1]))

def parse_json(input_json):
    dict_array(input_json)
    json_values = list(input_json.values())
    i = 0
    while any([isinstance(elem, dict) for elem in json_values]):
        if isinstance(json_values[i], dict):
            dict_array(json_values[i])
            json_values = json_values[i]
            print(json_values)
            print([isinstance(elem, dict) for elem in json_values.values()])
        i+=1
        
        

input_json = {
   "user_identifier": 123,
   "first_name": "John",
   "last_name": "Doe",
   "user_age": 30,
   "address": {
       "city": {
           "name": "Bangalore",
           "code": 23
       },
       "state": "Karnataka"
   }
}

parse_json(input_json)



mapping = {
   "user_id": "user_identifier",
   "fname": "first_name",
   "lname": "last_name",
   "age": "user_age",
   "city_name": "address.city.name",
   "city_code": "address.city.code",
   "state": "address.state",
}


# output_json = {
#   "user_id": 123,
#   "fname": "John",
#   "lname": "Doe",
#   "age": 30,
#   "city_name": "Bangalore",
#   "city_code": 23,
#   "state": "Karnataka"
# }
