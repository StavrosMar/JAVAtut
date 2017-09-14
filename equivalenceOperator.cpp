// This is a program for clarification of equivalence operator between JAVA (change of pointer) vs CPP (copy the values to a new object)
#include <iostream>
#include <string>

class Snoop {
    
public: 


    std::string dogg{"ThangzChanged"};
};


int main()
{
  
  Snoop chronic;
  chronic.dogg = "chronic";
  
  Snoop dre;
  dre.dogg = "dre";
  
  std::cout<<"Address of chronic :"<< &chronic <<"\n";
  std::cout<<"Address of dre before :"<< &dre <<"\n";
  
  // JAVA: The equivalent in java would dre and chronic now point to the same
  // object
  
  // CPP : However here the copy constructor is called so dre is getting
  // a copy of chronic so the objects are completely different (i.e. the dre address does not change but the value of dogg is copied over)
  dre = chronic;
  
  std::cout<<"Address of dre after  :"<< &dre <<"\n";
  std::cout<<"dogg of dre is        :"<< dre.dogg << "\n";
  
}
