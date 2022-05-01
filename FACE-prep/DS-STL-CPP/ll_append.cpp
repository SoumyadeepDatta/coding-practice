#include<bits/stdc++.h>
using namespace std;

class Node
{
    public:
    int data;
    Node * next;

    ~Node() {
        
    }
};

Node * head = NULL;
Node * node = NULL;
Node * temp = NULL;



void append(int);
void display(struct Node *);

int main(int argc, char const *argv[])
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int i;

    while (true){
        cin >> i;
        if(i == -1) {
            break;
        }
        else {
            append(i);
        }
    }
    
    display(head);

    return 0;
}

void append(int val) {

    

    if(!head) {
        head = new Node();
        head->data = val;
        head->next = NULL;
        temp = head;
    }
    else {
        node = new Node();
        temp->next = node;
        node->data = val;
        node->next = NULL;
        temp = node;
    }
}

void display(Node * head) {
    while(head) {
        cout << head->data << endl;
        head = head->next;
    }
}