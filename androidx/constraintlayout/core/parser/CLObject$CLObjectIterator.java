package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;

class CLObject$CLObjectIterator
  implements Iterator
{
  public CLObject o00OoOoo;
  public int o00Ooo00 = 0;
  
  public CLObject$CLObjectIterator(CLObject paramCLObject1, CLObject paramCLObject2)
  {
    this.o00OoOoo = paramCLObject2;
  }
  
  public boolean hasNext()
  {
    int i = this.o00Ooo00;
    CLObject localCLObject = this.o00OoOoo;
    int j = localCLObject.size();
    if (i < j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public Object next()
  {
    Object localObject = this.o00OoOoo.o00OooO0;
    int i = this.o00Ooo00;
    localObject = (CLKey)((ArrayList)localObject).get(i);
    i = this.o00Ooo00 + 1;
    this.o00Ooo00 = i;
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.parser.CLObject.CLObjectIterator
 * JD-Core Version:    0.7.0.1
 */