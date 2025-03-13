package androidx.emoji2.text;

import java.util.Arrays;

final class EmojiProcessor$ProcessorSm
{
  public int OooO00o = 1;
  public final MetadataRepo.Node OooO0O0;
  public MetadataRepo.Node OooO0OO;
  public MetadataRepo.Node OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public final boolean OooO0oO;
  public final int[] OooO0oo;
  
  public EmojiProcessor$ProcessorSm(MetadataRepo.Node paramNode, boolean paramBoolean, int[] paramArrayOfInt)
  {
    this.OooO0O0 = paramNode;
    this.OooO0OO = paramNode;
    this.OooO0oO = paramBoolean;
    this.OooO0oo = paramArrayOfInt;
  }
  
  private static boolean isEmojiStyle(int paramInt)
  {
    int i = 65039;
    if (paramInt == i) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  private static boolean isTextStyle(int paramInt)
  {
    int i = 65038;
    if (paramInt == i) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public int OooO00o(int paramInt)
  {
    Object localObject = this.OooO0OO.get(paramInt);
    int i = this.OooO00o;
    int j = 1;
    int k = 2;
    if (i != k) {
      if (localObject != null) {}
    }
    boolean bool2;
    do
    {
      do
      {
        do
        {
          k = OooO0O0();
          break;
          this.OooO00o = k;
          this.OooO0OO = ((MetadataRepo.Node)localObject);
          this.OooO0o = j;
          break;
          if (localObject != null)
          {
            this.OooO0OO = ((MetadataRepo.Node)localObject);
            int m = this.OooO0o + j;
            this.OooO0o = m;
            break;
          }
          bool1 = isTextStyle(paramInt);
        } while (bool1);
        boolean bool1 = isEmojiStyle(paramInt);
        if (bool1) {
          break;
        }
        localObject = this.OooO0OO.getData();
      } while (localObject == null);
      int n = this.OooO0o;
      k = 3;
      if (n != j) {
        break;
      }
      bool2 = OooO0OO();
    } while (!bool2);
    localObject = this.OooO0OO;
    this.OooO0Oo = ((MetadataRepo.Node)localObject);
    OooO0O0();
    this.OooO0o0 = paramInt;
    return k;
  }
  
  public final int OooO0O0()
  {
    int i = 1;
    this.OooO00o = i;
    MetadataRepo.Node localNode = this.OooO0O0;
    this.OooO0OO = localNode;
    this.OooO0o = 0;
    return i;
  }
  
  public final boolean OooO0OO()
  {
    Object localObject = this.OooO0OO.getData();
    boolean bool1 = ((EmojiMetadata)localObject).isDefaultEmoji();
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    bool1 = isEmojiStyle(this.OooO0o0);
    if (bool1) {
      return bool2;
    }
    bool1 = this.OooO0oO;
    if (bool1)
    {
      localObject = this.OooO0oo;
      if (localObject == null) {
        return bool2;
      }
      localObject = this.OooO0OO.getData();
      int i = ((EmojiMetadata)localObject).getCodepointAt(0);
      int[] arrayOfInt = this.OooO0oo;
      i = Arrays.binarySearch(arrayOfInt, i);
      if (i < 0) {
        return bool2;
      }
    }
    return false;
  }
  
  public EmojiMetadata getCurrentMetadata()
  {
    return this.OooO0OO.getData();
  }
  
  public EmojiMetadata getFlushMetadata()
  {
    return this.OooO0Oo.getData();
  }
  
  public boolean isInFlushableState()
  {
    int i = this.OooO00o;
    int j = 2;
    if (i == j)
    {
      EmojiMetadata localEmojiMetadata = this.OooO0OO.getData();
      if (localEmojiMetadata != null)
      {
        i = this.OooO0o;
        j = 1;
        if (i > j) {
          return j;
        }
        boolean bool = OooO0OO();
        if (bool) {
          return j;
        }
      }
    }
    j = 0;
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.EmojiProcessor.ProcessorSm
 * JD-Core Version:    0.7.0.1
 */