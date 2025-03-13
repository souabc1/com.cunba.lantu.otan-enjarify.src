package androidx.constraintlayout.core.parser;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class CLContainer
  extends CLElement
{
  public ArrayList o00OooO0;
  
  public CLContainer(char[] paramArrayOfChar)
  {
    super(paramArrayOfChar);
    paramArrayOfChar = new java/util/ArrayList;
    paramArrayOfChar.<init>();
    this.o00OooO0 = paramArrayOfChar;
  }
  
  public void OooO0OO(CLElement paramCLElement)
  {
    Object localObject = this.o00OooO0;
    ((ArrayList)localObject).add(paramCLElement);
    boolean bool = CLParser.OooO0Oo;
    if (bool)
    {
      localObject = System.out;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "added element ";
      localStringBuilder.append(str);
      localStringBuilder.append(paramCLElement);
      localStringBuilder.append(" to ");
      localStringBuilder.append(this);
      paramCLElement = localStringBuilder.toString();
      ((PrintStream)localObject).println(paramCLElement);
    }
  }
  
  public CLElement get(int paramInt)
  {
    if (paramInt >= 0)
    {
      localObject = this.o00OooO0;
      int i = ((ArrayList)localObject).size();
      if (paramInt < i) {
        return (CLElement)this.o00OooO0.get(paramInt);
      }
    }
    Object localObject = new androidx/constraintlayout/core/parser/CLParsingException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("no element at index ");
    localStringBuilder.append(paramInt);
    String str = localStringBuilder.toString();
    ((CLParsingException)localObject).<init>(str, this);
    throw ((Throwable)localObject);
  }
  
  public CLArray getArray(int paramInt)
  {
    Object localObject = get(paramInt);
    boolean bool = localObject instanceof CLArray;
    if (bool) {
      return (CLArray)localObject;
    }
    localObject = new androidx/constraintlayout/core/parser/CLParsingException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("no array at index ");
    localStringBuilder.append(paramInt);
    String str = localStringBuilder.toString();
    ((CLParsingException)localObject).<init>(str, this);
    throw ((Throwable)localObject);
  }
  
  public boolean getBoolean(int paramInt)
  {
    Object localObject = get(paramInt);
    boolean bool = localObject instanceof CLToken;
    if (bool) {
      return ((CLToken)localObject).getBoolean();
    }
    localObject = new androidx/constraintlayout/core/parser/CLParsingException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("no boolean at index ");
    localStringBuilder.append(paramInt);
    String str = localStringBuilder.toString();
    ((CLParsingException)localObject).<init>(str, this);
    throw ((Throwable)localObject);
  }
  
  public float getFloat(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject != null) {
      return ((CLElement)localObject).getFloat();
    }
    localObject = new androidx/constraintlayout/core/parser/CLParsingException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("no float at index ");
    localStringBuilder.append(paramInt);
    String str = localStringBuilder.toString();
    ((CLParsingException)localObject).<init>(str, this);
    throw ((Throwable)localObject);
  }
  
  public int getInt(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject != null) {
      return ((CLElement)localObject).getInt();
    }
    localObject = new androidx/constraintlayout/core/parser/CLParsingException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("no int at index ");
    localStringBuilder.append(paramInt);
    String str = localStringBuilder.toString();
    ((CLParsingException)localObject).<init>(str, this);
    throw ((Throwable)localObject);
  }
  
  public CLObject getObject(int paramInt)
  {
    Object localObject = get(paramInt);
    boolean bool = localObject instanceof CLObject;
    if (bool) {
      return (CLObject)localObject;
    }
    localObject = new androidx/constraintlayout/core/parser/CLParsingException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("no object at index ");
    localStringBuilder.append(paramInt);
    String str = localStringBuilder.toString();
    ((CLParsingException)localObject).<init>(str, this);
    throw ((Throwable)localObject);
  }
  
  public CLElement getOrNull(int paramInt)
  {
    if (paramInt >= 0)
    {
      ArrayList localArrayList = this.o00OooO0;
      int i = localArrayList.size();
      if (paramInt < i) {
        return (CLElement)this.o00OooO0.get(paramInt);
      }
    }
    return null;
  }
  
  public String getString(int paramInt)
  {
    Object localObject = get(paramInt);
    boolean bool = localObject instanceof CLString;
    if (bool) {
      return ((CLElement)localObject).OooO00o();
    }
    localObject = new androidx/constraintlayout/core/parser/CLParsingException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("no string at index ");
    localStringBuilder.append(paramInt);
    String str = localStringBuilder.toString();
    ((CLParsingException)localObject).<init>(str, this);
    throw ((Throwable)localObject);
  }
  
  public String getStringOrNull(int paramInt)
  {
    CLElement localCLElement = getOrNull(paramInt);
    boolean bool = localCLElement instanceof CLString;
    if (bool) {
      return ((CLElement)localCLElement).OooO00o();
    }
    return null;
  }
  
  public int size()
  {
    return this.o00OooO0.size();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = this.o00OooO0.iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (CLElement)((Iterator)localObject1).next();
      int i = localStringBuilder.length();
      if (i > 0)
      {
        String str = "; ";
        localStringBuilder.append(str);
      }
      localStringBuilder.append(localObject2);
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = super.toString();
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(" = <");
    ((StringBuilder)localObject1).append(localStringBuilder);
    ((StringBuilder)localObject1).append(" >");
    return ((StringBuilder)localObject1).toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.parser.CLContainer
 * JD-Core Version:    0.7.0.1
 */