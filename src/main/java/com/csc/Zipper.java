package com.csc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zipper
{
  public <T> List<T> zip(List<T> list1, List<T> list2)
  {
    // Creates iterators for both of the lists that are passed
    // into the method and initializes zipped list
    List<T> zipped = new ArrayList<>();
    Iterator<T> it1 = list1.iterator();
    Iterator<T> it2 = list2.iterator();

    // Checks if there is still a next value
    while(it1.hasNext() && it2.hasNext())
    {
      // Adds from each list in succession
      zipped.add(it1.next());
      zipped.add(it2.next());
    }

    // Adds remainder of list1 if none left in list2
    while(it1.hasNext())
    {
      zipped.add(it1.next());
    }

    // Adds remainder of list2 if none in list1
    while(it2.hasNext())
    {
      zipped.add(it2.next());
    }
    
    return zipped;
  }
}
