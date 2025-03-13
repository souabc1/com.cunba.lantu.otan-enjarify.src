package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory2;
import android.view.View;

class LayoutInflaterCompat$Factory2Wrapper
  implements LayoutInflater.Factory2
{
  public final LayoutInflaterFactory o00OoOoo;
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.o00OoOoo.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.o00OoOoo.onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = getClass().getName();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("{");
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.LayoutInflaterCompat.Factory2Wrapper
 * JD-Core Version:    0.7.0.1
 */