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
Node * ptr = NULL;


void append(int);
void display(Node *);
void insert_bef(int, int);

int main(int argc, char const *argv[])
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int i, pos, x;

    // take input until -ve is entered

    while (true){
        cin >> i;
        if(i < 0) {
            break;
        }
        else {
            append(i);
        }
    }

    cin >> pos >> x;
    
    cout << "bef" << endl;
    display(head);

    insert_bef(pos, x);

    cout << "after" << endl;
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
    Node * ptr = head;
    while(ptr) {
        cout << ptr->data << endl;
        ptr = ptr->next;
    }
}
 
void insert_bef(int pos, int val) {
    Node * bef = head;
    ptr = head;

    if(!head) {
        return;
    }

    if(pos == 1) {
        node = new Node();
        node->data = val;
        node->next = head;
        head = node;
        return;
    }

    while(--pos >= 0) {
        if(!ptr) {
            break;
        }
        if(pos == 0) {
            node = new Node();
            node->data = val;
            node->next = ptr;
            bef->next = node;
            break;
        }
        bef = ptr;
        ptr = ptr->next;
    }
}