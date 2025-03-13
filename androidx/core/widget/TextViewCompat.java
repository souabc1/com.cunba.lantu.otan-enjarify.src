package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.view.ActionMode.Callback;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.text.PrecomputedTextCompat.Params;
import androidx.core.util.Preconditions;

public final class TextViewCompat
{
  public static void OooO(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    TextViewCompat.Api17Impl.OooO0o0(paramTextView, paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public static Drawable[] OooO00o(TextView paramTextView)
  {
    return TextViewCompat.Api17Impl.OooO00o(paramTextView);
  }
  
  public static int OooO0O0(TextView paramTextView)
  {
    int i = paramTextView.getPaddingTop();
    int j = paramTextView.getPaint().getFontMetricsInt().top;
    return i - j;
  }
  
  public static int OooO0OO(TextView paramTextView)
  {
    int i = paramTextView.getPaddingBottom();
    int j = paramTextView.getPaint().getFontMetricsInt().bottom;
    return i + j;
  }
  
  public static int OooO0Oo(TextView paramTextView)
  {
    return TextViewCompat.Api16Impl.OooO0O0(paramTextView);
  }
  
  public static PrecomputedTextCompat.Params OooO0o(TextView paramTextView)
  {
    PrecomputedTextCompat.Params localParams = new androidx/core/text/PrecomputedTextCompat$Params;
    paramTextView = TextViewCompat.Api28Impl.OooO0O0(paramTextView);
    localParams.<init>(paramTextView);
    return localParams;
  }
  
  public static int OooO0o0(TextDirectionHeuristic paramTextDirectionHeuristic)
  {
    TextDirectionHeuristic localTextDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
    int i = 1;
    if (paramTextDirectionHeuristic == localTextDirectionHeuristic) {
      return i;
    }
    localTextDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    if (paramTextDirectionHeuristic == localTextDirectionHeuristic) {
      return i;
    }
    localTextDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
    if (paramTextDirectionHeuristic == localTextDirectionHeuristic) {
      return 2;
    }
    localTextDirectionHeuristic = TextDirectionHeuristics.LTR;
    if (paramTextDirectionHeuristic == localTextDirectionHeuristic) {
      return 3;
    }
    localTextDirectionHeuristic = TextDirectionHeuristics.RTL;
    if (paramTextDirectionHeuristic == localTextDirectionHeuristic) {
      return 4;
    }
    localTextDirectionHeuristic = TextDirectionHeuristics.LOCALE;
    if (paramTextDirectionHeuristic == localTextDirectionHeuristic) {
      return 5;
    }
    localTextDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    if (paramTextDirectionHeuristic == localTextDirectionHeuristic) {
      return 6;
    }
    localTextDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
    if (paramTextDirectionHeuristic == localTextDirectionHeuristic) {
      return 7;
    }
    return i;
  }
  
  public static void OooO0oO(TextView paramTextView, ColorStateList paramColorStateList)
  {
    Preconditions.OooO0oo(paramTextView);
    TextViewCompat.Api23Impl.OooO0o(paramTextView, paramColorStateList);
  }
  
  public static void OooO0oo(TextView paramTextView, PorterDuff.Mode paramMode)
  {
    Preconditions.OooO0oo(paramTextView);
    TextViewCompat.Api23Impl.OooO0oO(paramTextView, paramMode);
  }
  
  public static void OooOO0(TextView paramTextView, int paramInt)
  {
    Preconditions.OooO0o0(paramInt);
    TextViewCompat.Api28Impl.OooO0OO(paramTextView, paramInt);
  }
  
  public static void OooOO0O(TextView paramTextView, int paramInt)
  {
    Preconditions.OooO0o0(paramInt);
    Paint.FontMetricsInt localFontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
    boolean bool = TextViewCompat.Api16Impl.OooO00o(paramTextView);
    int j;
    if (bool) {
      j = localFontMetricsInt.bottom;
    } else {
      j = localFontMetricsInt.descent;
    }
    int i = Math.abs(j);
    if (paramInt > i)
    {
      paramInt -= j;
      j = paramTextView.getPaddingLeft();
      i = paramTextView.getPaddingTop();
      int k = paramTextView.getPaddingRight();
      paramTextView.setPadding(j, i, k, paramInt);
    }
  }
  
  public static void OooOO0o(TextView paramTextView, int paramInt)
  {
    Preconditions.OooO0o0(paramInt);
    TextPaint localTextPaint = paramTextView.getPaint();
    int i = localTextPaint.getFontMetricsInt(null);
    if (paramInt != i)
    {
      paramInt -= i;
      float f1 = paramInt;
      i = 1065353216;
      float f2 = 1.0F;
      paramTextView.setLineSpacing(f1, f2);
    }
  }
  
  public static void OooOOO(TextView paramTextView, int paramInt)
  {
    paramTextView.setTextAppearance(paramInt);
  }
  
  public static void OooOOO0(TextView paramTextView, PrecomputedTextCompat paramPrecomputedTextCompat)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      paramPrecomputedTextCompat = paramPrecomputedTextCompat.getPrecomputedText();
    }
    for (;;)
    {
      paramTextView.setText(paramPrecomputedTextCompat);
      break;
      PrecomputedTextCompat.Params localParams1 = OooO0o(paramTextView);
      PrecomputedTextCompat.Params localParams2 = paramPrecomputedTextCompat.getParams();
      boolean bool = localParams1.OooO00o(localParams2);
      if (!bool) {
        break label53;
      }
    }
    return;
    label53:
    paramTextView = new java/lang/IllegalArgumentException;
    paramTextView.<init>("Given text can not be applied to TextView.");
    throw paramTextView;
  }
  
  public static void OooOOOO(TextView paramTextView, PrecomputedTextCompat.Params paramParams)
  {
    int i = OooO0o0(paramParams.getTextDirection());
    TextViewCompat.Api17Impl.OooO0oo(paramTextView, i);
    TextPaint localTextPaint1 = paramTextView.getPaint();
    TextPaint localTextPaint2 = paramParams.getTextPaint();
    localTextPaint1.set(localTextPaint2);
    i = paramParams.getBreakStrategy();
    TextViewCompat.Api23Impl.OooO0o0(paramTextView, i);
    int j = paramParams.getHyphenationFrequency();
    TextViewCompat.Api23Impl.OooO0oo(paramTextView, j);
  }
  
  public static ActionMode.Callback OooOOOo(ActionMode.Callback paramCallback)
  {
    boolean bool = paramCallback instanceof TextViewCompat.OreoCallback;
    if (bool) {
      paramCallback = ((TextViewCompat.OreoCallback)paramCallback).getWrappedCallback();
    }
    return paramCallback;
  }
  
  public static ActionMode.Callback OooOOo0(TextView paramTextView, ActionMode.Callback paramCallback)
  {
    return paramCallback;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.TextViewCompat
 * JD-Core Version:    0.7.0.1
 */