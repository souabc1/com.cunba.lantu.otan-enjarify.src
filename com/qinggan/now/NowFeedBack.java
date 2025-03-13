package com.qinggan.now;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import m54207b69;

public class NowFeedBack
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public NowCardType o00OoOoo;
  public HashMap o00Ooo0;
  public NowFeedBackAction o00Ooo00;
  
  static
  {
    NowFeedBack.1 local1 = new com/qinggan/now/NowFeedBack$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public NowCardType getCardType()
  {
    return this.o00OoOoo;
  }
  
  public NowFeedBackAction getFeedbackAction()
  {
    return this.o00Ooo00;
  }
  
  public HashMap getValues()
  {
    return this.o00Ooo0;
  }
  
  public void setCardType(NowCardType paramNowCardType)
  {
    this.o00OoOoo = paramNowCardType;
  }
  
  public void setFeedbackAction(NowFeedBackAction paramNowFeedBackAction)
  {
    this.o00Ooo00 = paramNowFeedBackAction;
  }
  
  public void setValue(HashMap paramHashMap)
  {
    this.o00Ooo0 = paramHashMap;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("^W193922143637391C3E3D4678184144344314403A4682");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = this.o00OoOoo;
    ((StringBuilder)localObject1).append(localObject2);
    localObject2 = m54207b69.F54207b69_11("bN62292D2E2E3135342D183745332E2E83");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = this.o00Ooo00;
    ((StringBuilder)localObject1).append(localObject2);
    localObject2 = m54207b69.F54207b69_11("Et5803171B05160D5517");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = this.o00Ooo0;
    if (localObject2 != null)
    {
      localObject2 = ((HashMap)localObject2).keySet().iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        String str = (String)((Iterator)localObject2).next();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append((String)localObject1);
        localStringBuilder.append(str);
        localStringBuilder.append("->");
        localObject1 = (String)this.o00Ooo0.get(str);
        localStringBuilder.append((String)localObject1);
        localStringBuilder.append(",");
        localObject1 = localStringBuilder.toString();
      }
    }
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append("}]");
    return ((StringBuilder)localObject2).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OoOoo;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooo00;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    HashMap localHashMap = this.o00Ooo0;
    paramParcel.writeMap(localHashMap);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NowFeedBack
 * JD-Core Version:    0.7.0.1
 */