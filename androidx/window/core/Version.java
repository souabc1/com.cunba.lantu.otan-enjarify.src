package androidx.window.core;

import java.math.BigInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Version
  implements Comparable
{
  public static final Version o00OooO;
  public static final Version.Companion o00OooO0;
  public static final Version o00OooOO;
  public static final Version o00OooOo;
  public static final Version o0O00o0;
  public final int o00OoOoo;
  public final int o00Ooo0;
  public final int o00Ooo00;
  public final String o00Ooo0O;
  public final Lazy o00Ooo0o;
  
  static
  {
    Object localObject = new androidx/window/core/Version$Companion;
    ((Version.Companion)localObject).<init>(null);
    o00OooO0 = (Version.Companion)localObject;
    localObject = new androidx/window/core/Version;
    String str = "";
    ((Version)localObject).<init>(0, 0, 0, str);
    o00OooO = (Version)localObject;
    localObject = new androidx/window/core/Version;
    int i = 1;
    ((Version)localObject).<init>(0, i, 0, str);
    o00OooOO = (Version)localObject;
    localObject = new androidx/window/core/Version;
    ((Version)localObject).<init>(i, 0, 0, str);
    o00OooOo = (Version)localObject;
    o0O00o0 = (Version)localObject;
  }
  
  public Version(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    this.o00OoOoo = paramInt1;
    this.o00Ooo00 = paramInt2;
    this.o00Ooo0 = paramInt3;
    this.o00Ooo0O = paramString;
    Object localObject = new androidx/window/core/Version$bigInteger$2;
    ((Version.bigInteger.2)localObject).<init>(this);
    localObject = LazyKt.OooO0O0((Function0)localObject);
    this.o00Ooo0o = ((Lazy)localObject);
  }
  
  private final BigInteger getBigInteger()
  {
    Object localObject = this.o00Ooo0o.getValue();
    Intrinsics.OooO0o0(localObject, "<get-bigInteger>(...)");
    return (BigInteger)localObject;
  }
  
  public int OooO0o(Version paramVersion)
  {
    Intrinsics.OooO0o(paramVersion, "other");
    BigInteger localBigInteger = getBigInteger();
    paramVersion = paramVersion.getBigInteger();
    return localBigInteger.compareTo(paramVersion);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Version;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    int i = this.o00OoOoo;
    paramObject = (Version)paramObject;
    int j = paramObject.o00OoOoo;
    if (i == j)
    {
      i = this.o00Ooo00;
      j = paramObject.o00Ooo00;
      if (i == j)
      {
        i = this.o00Ooo0;
        int k = paramObject.o00Ooo0;
        if (i == k) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final String getDescription()
  {
    return this.o00Ooo0O;
  }
  
  public final int getMajor()
  {
    return this.o00OoOoo;
  }
  
  public final int getMinor()
  {
    return this.o00Ooo00;
  }
  
  public final int getPatch()
  {
    return this.o00Ooo0;
  }
  
  public int hashCode()
  {
    int i = this.o00OoOoo;
    int j = (527 + i) * 31;
    i = this.o00Ooo00;
    j = (j + i) * 31;
    i = this.o00Ooo0;
    return j + i;
  }
  
  public String toString()
  {
    String str = this.o00Ooo0O;
    boolean bool = StringsKt.OooOO0O(str) ^ true;
    if (bool)
    {
      localObject = this.o00Ooo0O;
      str = Intrinsics.OooOOOO("-", localObject);
    }
    else
    {
      str = "";
    }
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    int i = this.o00OoOoo;
    ((StringBuilder)localObject).append(i);
    i = 46;
    ((StringBuilder)localObject).append(i);
    int k = this.o00Ooo00;
    ((StringBuilder)localObject).append(k);
    ((StringBuilder)localObject).append(i);
    int j = this.o00Ooo0;
    ((StringBuilder)localObject).append(j);
    ((StringBuilder)localObject).append(str);
    return ((StringBuilder)localObject).toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.core.Version
 * JD-Core Version:    0.7.0.1
 */