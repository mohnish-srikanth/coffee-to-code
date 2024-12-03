import json
import psycopg2

def read_employees_data():
    with open('employees_data.json', 'r') as file:
        data = json.load(file)
    
    return data

def create_table(conn, cur):
    cur.execute(
        """
            CREATE TABLE IF NOT EXISTS employee(
                user_id varchar(255) PRIMARY KEY,
                first_name varchar(255),
                last_name varchar(255),
                preferred_full_name varchar(255),
                employee_code varchar(255),
                region varchar(255),
                phone_number varchar(255),
                email_address varchar(255)
            )
        """
    )

    conn.commit()

def insert_data(conn, cur, employee):
    cur.execute(
        """
            INSERT INTO employee(
                user_id,
                first_name,
                last_name,
                preferred_full_name,
                employee_code,
                region,
                phone_number,
                email_address
            )
            VALUES
            (%s, %s, %s, %s, %s, %s, %s, %s)
            ON CONFLICT (user_id) DO NOTHING
        """, (
            employee['userId'], employee['firstName'], employee['lastName'], employee['preferredFullName']
            ,employee['employeeCode'], employee['region'], employee['phoneNumber'], employee['emailAddress']
        )
    )

    conn.commit()

if __name__ == "__main__":
    conn = psycopg2.connect("host=localhost dbname=test_db user=postgres password=postgres")
    cur = conn.cursor()

    employee_data = read_employees_data()
    employee_data = employee_data['Employees']

    create_table(conn, cur)

    for employee in employee_data:
        insert_data(conn, cur, employee)
