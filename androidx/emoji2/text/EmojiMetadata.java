package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;

public class EmojiMetadata
{
  public static final ThreadLocal OooO0Oo;
  public final int OooO00o;
  public final MetadataRepo OooO0O0;
  public volatile int OooO0OO = 0;
  
  static
  {
    ThreadLocal localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    OooO0Oo = localThreadLocal;
  }
  
  public EmojiMetadata(MetadataRepo paramMetadataRepo, int paramInt)
  {
    this.OooO0O0 = paramMetadataRepo;
    this.OooO00o = paramInt;
  }
  
  private MetadataItem getMetadataItem()
  {
    Object localObject = OooO0Oo;
    MetadataItem localMetadataItem = (MetadataItem)((ThreadLocal)localObject).get();
    if (localMetadataItem == null)
    {
      localMetadataItem = new androidx/emoji2/text/flatbuffer/MetadataItem;
      localMetadataItem.<init>();
      ((ThreadLocal)localObject).set(localMetadataItem);
    }
    localObject = this.OooO0O0.getMetadataList();
    int i = this.OooO00o;
    ((MetadataList)localObject).OooOOOO(localMetadataItem, i);
    return localMetadataItem;
  }
  
  public void OooO00o(Canvas paramCanvas, float paramFloat1, float paramFloat2, Paint paramPaint)
  {
    Typeface localTypeface1 = this.OooO0O0.getTypeface();
    Typeface localTypeface2 = paramPaint.getTypeface();
    paramPaint.setTypeface(localTypeface1);
    int i = this.OooO00o * 2;
    char[] arrayOfChar = this.OooO0O0.getEmojiCharArray();
    paramCanvas.drawText(arrayOfChar, i, 2, paramFloat1, paramFloat2, paramPaint);
    paramPaint.setTypeface(localTypeface2);
  }
  
  public int getCodepointAt(int paramInt)
  {
    return getMetadataItem().OooOOO0(paramInt);
  }
  
  public int getCodepointsLength()
  {
    return getMetadataItem().OooOOO();
  }
  
  public short getCompatAdded()
  {
    return getMetadataItem().OooOOOO();
  }
  
  public int getHasGlyph()
  {
    return this.OooO0OO;
  }
  
  public short getHeight()
  {
    return getMetadataItem().OooOOo0();
  }
  
  public int getId()
  {
    return getMetadataItem().OooOOo();
  }
  
  public short getSdkAdded()
  {
    return getMetadataItem().OooOOoo();
  }
  
  public Typeface getTypeface()
  {
    return this.OooO0O0.getTypeface();
  }
  
  public short getWidth()
  {
    return getMetadataItem().OooOo00();
  }
  
  public boolean isDefaultEmoji()
  {
    return getMetadataItem().OooOOOo();
  }
  
  public void setHasGlyph(boolean paramBoolean)
  {
    if (paramBoolean) {
      paramBoolean = true;
    } else {
      paramBoolean = true;
    }
    this.OooO0OO = paramBoolean;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = super.toString();
    localStringBuilder.append(str1);
    localStringBuilder.append(", id:");
    str1 = Integer.toHexString(getId());
    localStringBuilder.append(str1);
    str1 = ", codepoints:";
    localStringBuilder.append(str1);
    int i = getCodepointsLength();
    int j = 0;
    while (j < i)
    {
      int k = getCodepointAt(j);
      String str2 = Integer.toHexString(k);
      localStringBuilder.append(str2);
      str2 = " ";
      localStringBuilder.append(str2);
      j += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.EmojiMetadata
 * JD-Core Version:    0.7.0.1
 */