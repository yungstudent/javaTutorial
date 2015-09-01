#include <stdio.h>
#include "Person.h"
void talk(PersonPtr p) 
{    printf("Hi, my name’s %s\n",p->name); 
    printf("and my age is %d\n", p->age);}void commentAboutAge(PersonPtr p) 
{ 
    if (p->age < 5) 
    {        printf("baby\n"); 
    }    if (p->age == 5) 
    {        printf("time to start school\n");    } 
}PersonPtr make_person(String aName, int anAge) 
{    PersonPtr p = (PersonPtr)malloc(sizeof(struct Person)); 

    p->name = aName;    p->age = anAge;    return p;}

int main() 
{ 
    PersonPtr ls,wp;    ls = make_person("Luke Skywalker",34); 
    wp = make_person("Winston Peters",48);    
    talk(ls);    talk(wp);    return 0; 
}