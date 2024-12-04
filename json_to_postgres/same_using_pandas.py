import pandas as pd
from sqlalchemy import create_engine

df = pd.read_json('employees_data.json')
df = pd.json_normalize(df['Employees'])

engine = create_engine('postgresql+psycopg2://postgres:postgres@localhost:5432/test_db')

df.to_sql('employee', engine, if_exists='append', index=False) 

print("Data inserted into postgres")