class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.length = 0
    
    def append(self, value):
        new_node = Node(value)
        if self.head is None: # condition linked list with no nodes
            self.head = new_node
            self.tail = new_node
        else: # condition for linked list with nodes
            self.tail.next = new_node
            self.tail = new_node
        self.length += 1

new_linked_list = LinkedList()
new_linked_list.append(10)
new_linked_list.append(20)
print(new_linked_list.length) # 2
print(new_linked_list.head.value) # 10 
print(new_linked_list.tail.value) # 20