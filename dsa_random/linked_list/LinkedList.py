# this code is to create a linked list with 1 node where the head and tail is the same

class Node:
    def __init__(self, value):
        self.value = value
        self.next = None
    
class LinkedList:
    def __init__(self, value):
        new_node = Node(value)
        self.head = new_node
        self.tail = new_node
        self.length = 1

new_linked_list = LinkedList(10)
print(new_linked_list) # <__main__.LinkedList object at 0x000001D28A0BB1A0>
print(new_linked_list.head.value) # 10
print(new_linked_list.tail.value) # 10
print(new_linked_list.length) # 1