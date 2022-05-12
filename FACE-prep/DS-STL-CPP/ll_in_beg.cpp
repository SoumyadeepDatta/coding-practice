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

void insert_beg(int);

void display(Node *);

int main(int argc, char const *argv[])
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int i;

    while(1) {
        cin >> i;
        if(i < 0) {
            break;
        }
        else {
            insert_beg(i);
        }
    }

    display(head);

    return 0;
}

void insert_beg(int val) {
    if(!head) {
        head = new Node();
        head->data = val;
        head->next = NULL;
    }
    else {
        node = new Node();
        node->data = val;
        node->next = head;
        head = node;
    }
}

void display(Node * head) {
    while(head) {
        cout << head->data << endl;
        head = head->next;
    }
}
