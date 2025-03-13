package com.google.zxing.oned.rss.expanded;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import java.util.Objects;
import m54207b69;

final class ExpandedPair
{
  private final FinderPattern finderPattern;
  private final DataCharacter leftChar;
  private final DataCharacter rightChar;
  
  public ExpandedPair(DataCharacter paramDataCharacter1, DataCharacter paramDataCharacter2, FinderPattern paramFinderPattern)
  {
    this.leftChar = paramDataCharacter1;
    this.rightChar = paramDataCharacter2;
    this.finderPattern = paramFinderPattern;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof ExpandedPair;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (ExpandedPair)paramObject;
    Object localObject = this.leftChar;
    DataCharacter localDataCharacter = paramObject.leftChar;
    bool1 = Objects.equals(localObject, localDataCharacter);
    if (bool1)
    {
      localObject = this.rightChar;
      localDataCharacter = paramObject.rightChar;
      bool1 = Objects.equals(localObject, localDataCharacter);
      if (bool1)
      {
        localObject = this.finderPattern;
        paramObject = paramObject.finderPattern;
        boolean bool3 = Objects.equals(localObject, paramObject);
        if (bool3) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public FinderPattern getFinderPattern()
  {
    return this.finderPattern;
  }
  
  public DataCharacter getLeftChar()
  {
    return this.leftChar;
  }
  
  public DataCharacter getRightChar()
  {
    return this.rightChar;
  }
  
  public int hashCode()
  {
    int i = Objects.hashCode(this.leftChar);
    int j = Objects.hashCode(this.rightChar);
    i ^= j;
    j = Objects.hashCode(this.finderPattern);
    return i ^ j;
  }
  
  public boolean mustBeLast()
  {
    DataCharacter localDataCharacter = this.rightChar;
    boolean bool;
    if (localDataCharacter == null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localDataCharacter = null;
    }
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[ ");
    Object localObject = this.leftChar;
    localStringBuilder.append(localObject);
    localStringBuilder.append(" , ");
    localObject = this.rightChar;
    localStringBuilder.append(localObject);
    localStringBuilder.append(" : ");
    localObject = this.finderPattern;
    if (localObject == null)
    {
      localObject = m54207b69.F54207b69_11("C?514B5556");
    }
    else
    {
      int i = ((FinderPattern)localObject).getValue();
      localObject = Integer.valueOf(i);
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append(" ]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.ExpandedPair
 * JD-Core Version:    0.7.0.1
 */