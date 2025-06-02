# this code is how to create a node that can be used in Linked Lists

class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

new_node = Node(10)
print(new_node) # <__main__.Node object at 0x0000023B5C2EAE40> this prints the in-memory location of the node that we just created