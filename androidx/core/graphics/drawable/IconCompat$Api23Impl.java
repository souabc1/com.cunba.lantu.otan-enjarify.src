package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.core.util.Preconditions;

class IconCompat$Api23Impl
{
  public static IconCompat OooO00o(Object paramObject)
  {
    Preconditions.OooO0oo(paramObject);
    int i = OooO0Oo(paramObject);
    int j = 2;
    if (i != j)
    {
      j = 4;
      if (i != j)
      {
        j = 6;
        if (i != j)
        {
          localObject = new androidx/core/graphics/drawable/IconCompat;
          ((IconCompat)localObject).<init>(-1);
          ((IconCompat)localObject).OooO0O0 = paramObject;
          return localObject;
        }
        return IconCompat.OooO0OO(OooO0o0(paramObject));
      }
      return IconCompat.OooO0o0(OooO0o0(paramObject));
    }
    Object localObject = OooO0OO(paramObject);
    int k = OooO0O0(paramObject);
    return IconCompat.OooO0oO(null, (String)localObject, k);
  }
  
  public static int OooO0O0(Object paramObject)
  {
    return IconCompat.Api28Impl.OooO00o(paramObject);
  }
  
  public static String OooO0OO(Object paramObject)
  {
    return IconCompat.Api28Impl.OooO0O0(paramObject);
  }
  
  public static int OooO0Oo(Object paramObject)
  {
    return IconCompat.Api28Impl.OooO0OO(paramObject);
  }
  
  public static Drawable OooO0o(Icon paramIcon, Context paramContext)
  {
    return paramIcon.loadDrawable(paramContext);
  }
  
  public static Uri OooO0o0(Object paramObject)
  {
    return IconCompat.Api28Impl.OooO0Oo(paramObject);
  }
  
  public static Icon OooO0oO(IconCompat paramIconCompat, Context paramContext)
  {
    int i = paramIconCompat.OooO00o;
    int j;
    Object localObject;
    switch (i)
    {
    case 0: 
    default: 
      paramIconCompat = new java/lang/IllegalArgumentException;
      paramIconCompat.<init>("Unknown type");
      throw paramIconCompat;
    case 6: 
      i = Build.VERSION.SDK_INT;
      j = 30;
      if (i >= j)
      {
        paramContext = IconCompat.Api30Impl.OooO00o(paramIconCompat.getUri());
      }
      else if (paramContext != null)
      {
        paramContext = paramIconCompat.OooO0oo(paramContext);
        if (paramContext != null)
        {
          paramContext = BitmapFactory.decodeStream(paramContext);
        }
        else
        {
          paramContext = new java/lang/IllegalStateException;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("Cannot load adaptive icon from uri: ");
          paramIconCompat = paramIconCompat.getUri();
          ((StringBuilder)localObject).append(paramIconCompat);
          paramIconCompat = ((StringBuilder)localObject).toString();
          paramContext.<init>(paramIconCompat);
          throw paramContext;
        }
      }
      else
      {
        paramContext = new java/lang/IllegalArgumentException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Context is required to resolve the file uri of the icon: ");
        paramIconCompat = paramIconCompat.getUri();
        ((StringBuilder)localObject).append(paramIconCompat);
        paramIconCompat = ((StringBuilder)localObject).toString();
        paramContext.<init>(paramIconCompat);
        throw paramContext;
      }
    case 5: 
      paramContext = (Bitmap)paramIconCompat.OooO0O0;
      paramContext = IconCompat.Api26Impl.OooO0O0(paramContext);
      break;
    case 4: 
      paramContext = Icon.createWithContentUri((String)paramIconCompat.OooO0O0);
      break;
    case 3: 
      paramContext = (byte[])paramIconCompat.OooO0O0;
      i = paramIconCompat.OooO0o0;
      j = paramIconCompat.OooO0o;
      paramContext = Icon.createWithData(paramContext, i, j);
      break;
    case 2: 
      paramContext = paramIconCompat.getResPackage();
      i = paramIconCompat.OooO0o0;
      paramContext = Icon.createWithResource(paramContext, i);
      break;
    case 1: 
      paramContext = Icon.createWithBitmap((Bitmap)paramIconCompat.OooO0O0);
      localObject = paramIconCompat.OooO0oO;
      if (localObject != null) {
        paramContext.setTintList((ColorStateList)localObject);
      }
      paramIconCompat = paramIconCompat.OooO0oo;
      localObject = IconCompat.OooOO0O;
      if (paramIconCompat != localObject) {
        paramContext.setTintMode(paramIconCompat);
      }
      return paramContext;
    }
    return (Icon)paramIconCompat.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.drawable.IconCompat.Api23Impl
 * JD-Core Version:    0.7.0.1
 */