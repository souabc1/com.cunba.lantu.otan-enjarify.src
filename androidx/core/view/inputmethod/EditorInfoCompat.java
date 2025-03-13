package androidx.core.view.inputmethod;

import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.Preconditions;

public final class EditorInfoCompat
{
  public static final String[] OooO00o = new String[0];
  
  public static boolean OooO00o(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      int i = 1;
      if (paramInt2 != i) {
        return false;
      }
      return Character.isHighSurrogate(paramCharSequence.charAt(paramInt1));
    }
    return Character.isLowSurrogate(paramCharSequence.charAt(paramInt1));
  }
  
  public static void OooO0O0(EditorInfo paramEditorInfo, String[] paramArrayOfString)
  {
    paramEditorInfo.contentMimeTypes = paramArrayOfString;
  }
  
  public static void OooO0OO(EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt)
  {
    Preconditions.OooO0oo(paramCharSequence);
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j)
    {
      EditorInfoCompat.Api30Impl.OooO00o(paramEditorInfo, paramCharSequence, paramInt);
      return;
    }
    i = paramEditorInfo.initialSelStart;
    j = paramEditorInfo.initialSelEnd;
    int k;
    if (i > j) {
      k = j - paramInt;
    } else {
      k = i - paramInt;
    }
    if (i > j) {
      i -= paramInt;
    } else {
      i = j - paramInt;
    }
    j = paramCharSequence.length();
    if ((paramInt >= 0) && (k >= 0) && (i <= j))
    {
      paramInt = isPasswordInputType(paramEditorInfo.inputType);
      if (paramInt != 0)
      {
        OooO0o0(paramEditorInfo, null, 0, 0);
        return;
      }
      paramInt = 2048;
      if (j <= paramInt)
      {
        OooO0o0(paramEditorInfo, paramCharSequence, k, i);
        return;
      }
      OooO0o(paramEditorInfo, paramCharSequence, k, i);
      return;
    }
    OooO0o0(paramEditorInfo, null, 0, 0);
  }
  
  public static void OooO0Oo(EditorInfo paramEditorInfo, CharSequence paramCharSequence)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j) {
      EditorInfoCompat.Api30Impl.OooO00o(paramEditorInfo, paramCharSequence, 0);
    } else {
      OooO0OO(paramEditorInfo, paramCharSequence, 0);
    }
  }
  
  public static void OooO0o(EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = paramInt2 - paramInt1;
    int j = 1024;
    if (i > j) {
      j = 0;
    } else {
      j = i;
    }
    int k = paramCharSequence.length() - paramInt2;
    int m = 2048 - j;
    double d1 = 0.8D;
    double d2 = m * d1;
    int n = (int)d2;
    n = Math.min(paramInt1, n);
    n = m - n;
    k = Math.min(k, n);
    m -= k;
    m = Math.min(paramInt1, m);
    paramInt1 -= m;
    boolean bool1 = OooO00o(paramCharSequence, paramInt1, 0);
    if (bool1)
    {
      paramInt1 += 1;
      m += -1;
    }
    int i1 = paramInt2 + k;
    int i3 = 1;
    i1 -= i3;
    boolean bool2 = OooO00o(paramCharSequence, i1, i3);
    if (bool2) {
      k += -1;
    }
    int i2 = m + j + k;
    if (j != i)
    {
      i = paramInt1 + m;
      CharSequence localCharSequence = paramCharSequence.subSequence(paramInt1, i);
      k += paramInt2;
      paramCharSequence = paramCharSequence.subSequence(paramInt2, k);
      paramInt2 = 2;
      CharSequence[] arrayOfCharSequence = new CharSequence[paramInt2];
      arrayOfCharSequence[0] = localCharSequence;
      arrayOfCharSequence[i3] = paramCharSequence;
      paramCharSequence = TextUtils.concat(arrayOfCharSequence);
    }
    else
    {
      i2 += paramInt1;
      paramCharSequence = paramCharSequence.subSequence(paramInt1, i2);
    }
    m += 0;
    j += m;
    OooO0o0(paramEditorInfo, paramCharSequence, m, j);
  }
  
  public static void OooO0o0(EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    Object localObject = paramEditorInfo.extras;
    if (localObject == null)
    {
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      paramEditorInfo.extras = ((Bundle)localObject);
    }
    if (paramCharSequence != null)
    {
      localObject = new android/text/SpannableStringBuilder;
      ((SpannableStringBuilder)localObject).<init>(paramCharSequence);
    }
    else
    {
      localObject = null;
    }
    paramEditorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", (CharSequence)localObject);
    paramEditorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", paramInt1);
    paramEditorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", paramInt2);
  }
  
  private static boolean isPasswordInputType(int paramInt)
  {
    paramInt &= 0xFFF;
    int i = 129;
    if (paramInt != i)
    {
      i = 225;
      if (paramInt != i)
      {
        i = 18;
        if (paramInt != i) {
          return 0;
        }
      }
    }
    paramInt = 1;
    return paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.inputmethod.EditorInfoCompat
 * JD-Core Version:    0.7.0.1
 */