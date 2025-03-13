package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R.styleable;
import androidx.fragment.app.strictmode.FragmentStrictMode;

class FragmentLayoutInflaterFactory
  implements LayoutInflater.Factory2
{
  public final FragmentManager o00OoOoo;
  
  public FragmentLayoutInflaterFactory(FragmentManager paramFragmentManager)
  {
    this.o00OoOoo = paramFragmentManager;
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    Object localObject1 = FragmentContainerView.class.getName();
    boolean bool1 = ((String)localObject1).equals(paramString);
    if (bool1)
    {
      paramView = new androidx/fragment/app/FragmentContainerView;
      paramString = this.o00OoOoo;
      paramView.<init>(paramContext, paramAttributeSet, paramString);
      return paramView;
    }
    boolean bool2 = "fragment".equals(paramString);
    bool1 = false;
    localObject1 = null;
    if (!bool2) {
      return null;
    }
    paramString = paramAttributeSet.getAttributeValue(null, "class");
    Object localObject2 = R.styleable.Fragment;
    localObject2 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject2);
    if (paramString == null)
    {
      int i = R.styleable.Fragment_android_name;
      paramString = ((TypedArray)localObject2).getString(i);
    }
    int j = R.styleable.Fragment_android_id;
    int k = -1;
    j = ((TypedArray)localObject2).getResourceId(j, k);
    int m = R.styleable.Fragment_android_tag;
    String str1 = ((TypedArray)localObject2).getString(m);
    ((TypedArray)localObject2).recycle();
    if (paramString != null)
    {
      localObject2 = paramContext.getClassLoader();
      boolean bool3 = FragmentFactory.OooO0O0((ClassLoader)localObject2, paramString);
      if (bool3)
      {
        int n;
        if (paramView != null)
        {
          n = paramView.getId();
        }
        else
        {
          n = 0;
          localObject2 = null;
        }
        if ((n == k) && (j == k) && (str1 == null))
        {
          paramView = new java/lang/IllegalArgumentException;
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>();
          paramAttributeSet = paramAttributeSet.getPositionDescription();
          paramContext.append(paramAttributeSet);
          paramContext.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
          paramContext.append(paramString);
          paramString = paramContext.toString();
          paramView.<init>(paramString);
          throw paramView;
        }
        if (j != k) {
          localObject1 = this.o00OoOoo.ooOO(j);
        }
        if ((localObject1 == null) && (str1 != null)) {
          localObject1 = this.o00OoOoo.o00O0O(str1);
        }
        if ((localObject1 == null) && (n != k)) {
          localObject1 = this.o00OoOoo.ooOO(n);
        }
        String str2 = "Fragment ";
        int i1 = 2;
        boolean bool4 = true;
        boolean bool6;
        if (localObject1 == null)
        {
          localObject1 = this.o00OoOoo.getFragmentFactory();
          paramContext = paramContext.getClassLoader();
          localObject1 = ((FragmentFactory)localObject1).OooO00o(paramContext, paramString);
          ((Fragment)localObject1).mFromLayout = bool4;
          int i2;
          if (j != 0) {
            i2 = j;
          } else {
            i2 = n;
          }
          ((Fragment)localObject1).mFragmentId = i2;
          ((Fragment)localObject1).mContainerId = n;
          ((Fragment)localObject1).mTag = str1;
          ((Fragment)localObject1).mInLayout = bool4;
          paramContext = this.o00OoOoo;
          ((Fragment)localObject1).mFragmentManager = paramContext;
          paramContext = paramContext.getHost();
          ((Fragment)localObject1).mHost = paramContext;
          paramContext = this.o00OoOoo.getHost().getContext();
          localObject2 = ((Fragment)localObject1).mSavedFragmentState;
          ((Fragment)localObject1).onInflate(paramContext, paramAttributeSet, (Bundle)localObject2);
          paramContext = this.o00OoOoo.OooOO0((Fragment)localObject1);
          bool6 = FragmentManager.isLoggingEnabled(i1);
          if (bool6)
          {
            paramAttributeSet = new java/lang/StringBuilder;
            paramAttributeSet.<init>();
            paramAttributeSet.append(str2);
            paramAttributeSet.append(localObject1);
          }
        }
        else
        {
          for (localObject2 = " has been inflated via the <fragment> tag: id=0x";; localObject2 = " has been re-attached via the <fragment> tag: id=0x")
          {
            paramAttributeSet.append((String)localObject2);
            localObject2 = Integer.toHexString(j);
            paramAttributeSet.append((String)localObject2);
            break;
            boolean bool5 = ((Fragment)localObject1).mInLayout;
            if (bool5) {
              break label806;
            }
            ((Fragment)localObject1).mInLayout = bool4;
            paramContext = this.o00OoOoo;
            ((Fragment)localObject1).mFragmentManager = paramContext;
            paramContext = paramContext.getHost();
            ((Fragment)localObject1).mHost = paramContext;
            paramContext = this.o00OoOoo.getHost().getContext();
            localObject2 = ((Fragment)localObject1).mSavedFragmentState;
            ((Fragment)localObject1).onInflate(paramContext, paramAttributeSet, (Bundle)localObject2);
            paramContext = this.o00OoOoo.OooOoO((Fragment)localObject1);
            bool6 = FragmentManager.isLoggingEnabled(i1);
            if (!bool6) {
              break;
            }
            paramAttributeSet = new java/lang/StringBuilder;
            paramAttributeSet.<init>();
            paramAttributeSet.append("Retained Fragment ");
            paramAttributeSet.append(localObject1);
          }
        }
        paramView = (ViewGroup)paramView;
        FragmentStrictMode.OooO((Fragment)localObject1, paramView);
        ((Fragment)localObject1).mContainer = paramView;
        paramContext.OooOO0o();
        paramContext.OooOO0();
        paramView = ((Fragment)localObject1).mView;
        if (paramView != null)
        {
          if (j != 0) {
            paramView.setId(j);
          }
          paramView = ((Fragment)localObject1).mView.getTag();
          if (paramView == null)
          {
            paramView = ((Fragment)localObject1).mView;
            paramView.setTag(str1);
          }
          paramView = ((Fragment)localObject1).mView;
          paramString = new androidx/fragment/app/FragmentLayoutInflaterFactory$1;
          paramString.<init>(this, paramContext);
          paramView.addOnAttachStateChangeListener(paramString);
          return ((Fragment)localObject1).mView;
        }
        paramView = new java/lang/IllegalStateException;
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramContext.append(str2);
        paramContext.append(paramString);
        paramContext.append(" did not create a view.");
        paramString = paramContext.toString();
        paramView.<init>(paramString);
        throw paramView;
        label806:
        paramView = new java/lang/IllegalArgumentException;
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramAttributeSet = paramAttributeSet.getPositionDescription();
        paramContext.append(paramAttributeSet);
        paramContext.append(": Duplicate id 0x");
        paramAttributeSet = Integer.toHexString(j);
        paramContext.append(paramAttributeSet);
        paramContext.append(", tag ");
        paramContext.append(str1);
        paramContext.append(", or parent id 0x");
        paramAttributeSet = Integer.toHexString(n);
        paramContext.append(paramAttributeSet);
        paramContext.append(" with another fragment for ");
        paramContext.append(paramString);
        paramString = paramContext.toString();
        paramView.<init>(paramString);
        throw paramView;
      }
    }
    return null;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentLayoutInflaterFactory
 * JD-Core Version:    0.7.0.1
 */