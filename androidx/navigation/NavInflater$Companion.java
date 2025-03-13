package androidx.navigation;

import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

public final class NavInflater$Companion
{
  public final NavType OooO00o(TypedValue paramTypedValue, NavType paramNavType1, NavType paramNavType2, String paramString1, String paramString2)
  {
    Intrinsics.OooO0o(paramTypedValue, "value");
    Intrinsics.OooO0o(paramNavType2, "expectedNavType");
    String str = "foundType";
    Intrinsics.OooO0o(paramString2, str);
    if ((paramNavType1 != null) && (paramNavType1 != paramNavType2))
    {
      paramNavType1 = new org/xmlpull/v1/XmlPullParserException;
      paramNavType2 = new java/lang/StringBuilder;
      paramNavType2.<init>();
      paramNavType2.append("Type is ");
      paramNavType2.append(paramString1);
      paramNavType2.append(" but found ");
      paramNavType2.append(paramString2);
      paramNavType2.append(": ");
      int i = paramTypedValue.data;
      paramNavType2.append(i);
      paramTypedValue = paramNavType2.toString();
      paramNavType1.<init>(paramTypedValue);
      throw paramNavType1;
    }
    if (paramNavType1 == null) {
      paramNavType1 = paramNavType2;
    }
    return paramNavType1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavInflater.Companion
 * JD-Core Version:    0.7.0.1
 */