package com.google.zxing.oned.rss.expanded;

import java.util.ArrayList;
import java.util.List;

final class ExpandedRow
{
  private final List pairs;
  private final int rowNumber;
  
  public ExpandedRow(List paramList, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramList);
    this.pairs = localArrayList;
    this.rowNumber = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof ExpandedRow;
    if (!bool) {
      return false;
    }
    paramObject = (ExpandedRow)paramObject;
    List localList = this.pairs;
    paramObject = paramObject.pairs;
    return localList.equals(paramObject);
  }
  
  public List getPairs()
  {
    return this.pairs;
  }
  
  public int getRowNumber()
  {
    return this.rowNumber;
  }
  
  public int hashCode()
  {
    return this.pairs.hashCode();
  }
  
  public boolean isEquivalent(List paramList)
  {
    return this.pairs.equals(paramList);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("{ ");
    List localList = this.pairs;
    localStringBuilder.append(localList);
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.ExpandedRow
 * JD-Core Version:    0.7.0.1
 */