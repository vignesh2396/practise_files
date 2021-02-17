from pymongo import MongoClient
import pprint

mc = MongoClient()
t = mc.test  # database name
c = t.users  # collection name
# pprint.pprint(c.find_one())

# CRUD Operation
c.insert_one({'_id': 1001, 'name': {'first': 'muthu', 'last': 'velan'}})  # Create
pprint.pprint(c.find({'_id': 1001}))
pprint.pprint(c.find_one())

# c.replace_one({'_id':1002}, {'name': {'first':'muthu', 'last':'kumar'}}) # Update
pprint.pprint(c.find_one({'_id': 1002}))  # Read

# c.delete_one({'_id:1001'})
pprint.pprint(c.find_one())
