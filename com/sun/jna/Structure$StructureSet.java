package com.sun.jna;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Structure$StructureSet
  extends AbstractCollection
  implements Set
{
  public Structure[] o00OoOoo;
  public int o00Ooo00;
  
  public boolean OooO00o(Structure paramStructure)
  {
    boolean bool = contains(paramStructure);
    if (!bool)
    {
      int i = this.o00Ooo00;
      int j = 1;
      i += j;
      OooO0O0(i);
      Structure[] arrayOfStructure = this.o00OoOoo;
      int k = this.o00Ooo00;
      int m = k + 1;
      this.o00Ooo00 = m;
      arrayOfStructure[k] = paramStructure;
      return j;
    }
    return false;
  }
  
  public final void OooO0O0(int paramInt)
  {
    Structure[] arrayOfStructure1 = this.o00OoOoo;
    Structure[] arrayOfStructure2;
    if (arrayOfStructure1 == null)
    {
      paramInt = paramInt * 3 / 2;
      arrayOfStructure2 = new Structure[paramInt];
      this.o00OoOoo = arrayOfStructure2;
    }
    else
    {
      int i = arrayOfStructure1.length;
      if (i < paramInt)
      {
        paramInt = paramInt * 3 / 2;
        arrayOfStructure2 = new Structure[paramInt];
        i = arrayOfStructure1.length;
        System.arraycopy(arrayOfStructure1, 0, arrayOfStructure2, 0, i);
        this.o00OoOoo = arrayOfStructure2;
      }
    }
  }
  
  public final int OooO0OO(Structure paramStructure)
  {
    int i = 0;
    for (;;)
    {
      int j = this.o00Ooo00;
      if (i >= j) {
        break label103;
      }
      Object localObject1 = this.o00OoOoo[i];
      if (paramStructure == localObject1) {
        break;
      }
      Object localObject2 = paramStructure.getClass();
      Class localClass = localObject1.getClass();
      if (localObject2 == localClass)
      {
        int k = paramStructure.OoooO00();
        int m = ((Structure)localObject1).OoooO00();
        if (k == m)
        {
          localObject2 = paramStructure.getPointer();
          localObject1 = ((Structure)localObject1).getPointer();
          boolean bool = ((Pointer)localObject2).equals(localObject1);
          if (bool) {
            break;
          }
        }
      }
      i += 1;
    }
    return i;
    label103:
    return -1;
  }
  
  public boolean contains(Object paramObject)
  {
    paramObject = (Structure)paramObject;
    int i = OooO0OO(paramObject);
    int j = -1;
    if (i != j)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramObject = null;
    }
    return i;
  }
  
  public Structure[] getElements()
  {
    return this.o00OoOoo;
  }
  
  public Iterator iterator()
  {
    int i = this.o00Ooo00;
    Structure[] arrayOfStructure1 = new Structure[i];
    if (i > 0)
    {
      Structure[] arrayOfStructure2 = this.o00OoOoo;
      System.arraycopy(arrayOfStructure2, 0, arrayOfStructure1, 0, i);
    }
    return Arrays.asList(arrayOfStructure1).iterator();
  }
  
  public boolean remove(Object paramObject)
  {
    paramObject = (Structure)paramObject;
    int i = OooO0OO(paramObject);
    int j = -1;
    if (i != j)
    {
      j = this.o00Ooo00;
      int k = 1;
      j -= k;
      this.o00Ooo00 = j;
      if (j >= 0)
      {
        Structure[] arrayOfStructure = this.o00OoOoo;
        Structure localStructure = arrayOfStructure[j];
        arrayOfStructure[i] = localStructure;
        i = 0;
        paramObject = null;
        arrayOfStructure[j] = null;
      }
      return k;
    }
    return false;
  }
  
  public int size()
  {
    return this.o00Ooo00;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.Structure.StructureSet
 * JD-Core Version:    0.7.0.1
 */