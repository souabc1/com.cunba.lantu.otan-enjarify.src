package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Preference
  implements Comparable
{
  public final Context o00OoOoo;
  public PreferenceDataStore o00Ooo0;
  public PreferenceManager o00Ooo00;
  public long o00Ooo0O;
  public boolean o00Ooo0o;
  public Preference.OnPreferenceClickListener o00OooO;
  public Preference.OnPreferenceChangeListener o00OooO0;
  public int o00OooOO;
  public int o00OooOo;
  public CharSequence o00OoooO;
  public int o00Ooooo;
  public boolean o00o0;
  public boolean o00o00;
  public String o00o000;
  public Drawable o00o0000;
  public Intent o00o000O;
  public String o00o000o;
  public boolean o00o00O0;
  public boolean o00o00Oo;
  public String o00o00o;
  public boolean o00o00o0;
  public Object o00o00oO;
  public boolean o00o00oo;
  public boolean o00o0O0;
  public boolean o00o0O00;
  public boolean o00o0O0O;
  public boolean o00o0OO;
  public boolean o00o0OO0;
  public boolean o00o0OOO;
  public boolean o00o0OOo;
  public int o00o0Oo;
  public boolean o00o0Oo0;
  public int o00o0OoO;
  public Preference.OnPreferenceChangeInternalListener o00o0Ooo;
  public boolean o00o0o;
  public List o00o0o00;
  public PreferenceGroup o00o0o0O;
  public boolean o00o0o0o;
  public Preference.SummaryProvider o00o0oO;
  public Preference.OnPreferenceCopyListener o00o0oO0;
  public final View.OnClickListener o00o0oOO;
  public CharSequence o0O00o0;
  public Bundle oo00oO;
  
  public Preference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public Preference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public Preference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public Preference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    int i = -1 >>> 1;
    this.o00OooOO = i;
    this.o00OooOo = 0;
    boolean bool1 = true;
    this.o00o00 = bool1;
    this.o00o00O0 = bool1;
    this.o00o00o0 = bool1;
    this.o00o00oo = bool1;
    this.o00o0 = bool1;
    this.o00o0O00 = bool1;
    this.o00o0O0 = bool1;
    this.o00o0O0O = bool1;
    this.o00o0OO = bool1;
    this.o00o0Oo0 = bool1;
    int j = R.layout.preference;
    this.o00o0Oo = j;
    Object localObject = new androidx/preference/Preference$1;
    ((Preference.1)localObject).<init>(this);
    this.o00o0oOO = ((View.OnClickListener)localObject);
    this.o00OoOoo = paramContext;
    localObject = R.styleable.Preference;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt1, paramInt2);
    int k = R.styleable.Preference_icon;
    paramInt1 = R.styleable.Preference_android_icon;
    k = TypedArrayUtils.OooOO0o(paramContext, k, paramInt1, 0);
    this.o00Ooooo = k;
    k = R.styleable.Preference_key;
    paramInt1 = R.styleable.Preference_android_key;
    paramAttributeSet = TypedArrayUtils.OooOOO0(paramContext, k, paramInt1);
    this.o00o000 = paramAttributeSet;
    k = R.styleable.Preference_title;
    paramInt1 = R.styleable.Preference_android_title;
    paramAttributeSet = TypedArrayUtils.OooOOO(paramContext, k, paramInt1);
    this.o0O00o0 = paramAttributeSet;
    k = R.styleable.Preference_summary;
    paramInt1 = R.styleable.Preference_android_summary;
    paramAttributeSet = TypedArrayUtils.OooOOO(paramContext, k, paramInt1);
    this.o00OoooO = paramAttributeSet;
    k = R.styleable.Preference_order;
    paramInt1 = R.styleable.Preference_android_order;
    k = TypedArrayUtils.OooO0Oo(paramContext, k, paramInt1, i);
    this.o00OooOO = k;
    k = R.styleable.Preference_fragment;
    paramInt1 = R.styleable.Preference_android_fragment;
    paramAttributeSet = TypedArrayUtils.OooOOO0(paramContext, k, paramInt1);
    this.o00o000o = paramAttributeSet;
    k = R.styleable.Preference_layout;
    paramInt1 = R.styleable.Preference_android_layout;
    paramInt2 = R.layout.preference;
    k = TypedArrayUtils.OooOO0o(paramContext, k, paramInt1, paramInt2);
    this.o00o0Oo = k;
    k = R.styleable.Preference_widgetLayout;
    paramInt1 = R.styleable.Preference_android_widgetLayout;
    k = TypedArrayUtils.OooOO0o(paramContext, k, paramInt1, 0);
    this.o00o0OoO = k;
    k = R.styleable.Preference_enabled;
    paramInt1 = R.styleable.Preference_android_enabled;
    boolean bool2 = TypedArrayUtils.OooO0O0(paramContext, k, paramInt1, bool1);
    this.o00o00 = bool2;
    int m = R.styleable.Preference_selectable;
    paramInt1 = R.styleable.Preference_android_selectable;
    boolean bool3 = TypedArrayUtils.OooO0O0(paramContext, m, paramInt1, bool1);
    this.o00o00O0 = bool3;
    int n = R.styleable.Preference_persistent;
    paramInt1 = R.styleable.Preference_android_persistent;
    boolean bool4 = TypedArrayUtils.OooO0O0(paramContext, n, paramInt1, bool1);
    this.o00o00o0 = bool4;
    int i1 = R.styleable.Preference_dependency;
    paramInt1 = R.styleable.Preference_android_dependency;
    paramAttributeSet = TypedArrayUtils.OooOOO0(paramContext, i1, paramInt1);
    this.o00o00o = paramAttributeSet;
    i1 = R.styleable.Preference_allowDividerAbove;
    paramInt1 = this.o00o00O0;
    boolean bool5 = TypedArrayUtils.OooO0O0(paramContext, i1, i1, paramInt1);
    this.o00o0O0 = bool5;
    int i2 = R.styleable.Preference_allowDividerBelow;
    paramInt1 = this.o00o00O0;
    boolean bool6 = TypedArrayUtils.OooO0O0(paramContext, i2, i2, paramInt1);
    this.o00o0O0O = bool6;
    int i3 = R.styleable.Preference_defaultValue;
    boolean bool7 = paramContext.hasValue(i3);
    if (bool7) {}
    for (int i4 = R.styleable.Preference_defaultValue;; i5 = R.styleable.Preference_android_defaultValue)
    {
      paramAttributeSet = OooOo(paramContext, i4);
      this.o00o00oO = paramAttributeSet;
      break;
      i4 = R.styleable.Preference_android_defaultValue;
      boolean bool8 = paramContext.hasValue(i4);
      if (!bool8) {
        break;
      }
    }
    int i5 = R.styleable.Preference_shouldDisableView;
    paramInt1 = R.styleable.Preference_android_shouldDisableView;
    boolean bool9 = TypedArrayUtils.OooO0O0(paramContext, i5, paramInt1, bool1);
    this.o00o0Oo0 = bool9;
    int i6 = R.styleable.Preference_singleLineTitle;
    boolean bool10 = paramContext.hasValue(i6);
    this.o00o0OO0 = bool10;
    if (bool10)
    {
      int i7 = R.styleable.Preference_singleLineTitle;
      paramInt1 = R.styleable.Preference_android_singleLineTitle;
      boolean bool11 = TypedArrayUtils.OooO0O0(paramContext, i7, paramInt1, bool1);
      this.o00o0OO = bool11;
    }
    int i8 = R.styleable.Preference_iconSpaceReserved;
    paramInt1 = R.styleable.Preference_android_iconSpaceReserved;
    boolean bool12 = TypedArrayUtils.OooO0O0(paramContext, i8, paramInt1, false);
    this.o00o0OOO = bool12;
    int i9 = R.styleable.Preference_isPreferenceVisible;
    boolean bool13 = TypedArrayUtils.OooO0O0(paramContext, i9, i9, bool1);
    this.o00o0O00 = bool13;
    int i10 = R.styleable.Preference_enableCopying;
    boolean bool14 = TypedArrayUtils.OooO0O0(paramContext, i10, i10, false);
    this.o00o0OOo = bool14;
    paramContext.recycle();
  }
  
  public Preference OooO(String paramString)
  {
    PreferenceManager localPreferenceManager = this.o00Ooo00;
    if (localPreferenceManager == null) {
      return null;
    }
    return localPreferenceManager.OooO00o(paramString);
  }
  
  public void OooO0O0(PreferenceGroup paramPreferenceGroup)
  {
    if (paramPreferenceGroup != null)
    {
      PreferenceGroup localPreferenceGroup = this.o00o0o0O;
      if (localPreferenceGroup != null)
      {
        paramPreferenceGroup = new java/lang/IllegalStateException;
        paramPreferenceGroup.<init>("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        throw paramPreferenceGroup;
      }
    }
    this.o00o0o0O = paramPreferenceGroup;
  }
  
  public boolean OooO0OO(Object paramObject)
  {
    Preference.OnPreferenceChangeListener localOnPreferenceChangeListener = this.o00OooO0;
    if (localOnPreferenceChangeListener != null)
    {
      bool = localOnPreferenceChangeListener.OooO0Oo(this, paramObject);
      if (!bool)
      {
        bool = false;
        paramObject = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public final void OooO0Oo()
  {
    this.o00o0o0o = false;
  }
  
  public void OooO0o(Bundle paramBundle)
  {
    boolean bool1 = OooOOO0();
    if (bool1)
    {
      String str = this.o00o000;
      paramBundle = paramBundle.getParcelable(str);
      if (paramBundle != null)
      {
        bool1 = false;
        str = null;
        this.o00o0o = false;
        OooOoo0(paramBundle);
        boolean bool2 = this.o00o0o;
        if (!bool2)
        {
          paramBundle = new java/lang/IllegalStateException;
          paramBundle.<init>("Derived class did not call super.onRestoreInstanceState()");
          throw paramBundle;
        }
      }
    }
  }
  
  public int OooO0o0(Preference paramPreference)
  {
    int i = this.o00OooOO;
    int j = paramPreference.o00OooOO;
    if (i != j) {
      return i - j;
    }
    Object localObject = this.o0O00o0;
    CharSequence localCharSequence = paramPreference.o0O00o0;
    if (localObject == localCharSequence) {
      return 0;
    }
    if (localObject == null) {
      return 1;
    }
    if (localCharSequence == null) {
      return -1;
    }
    localObject = ((CharSequence)localObject).toString();
    paramPreference = paramPreference.o0O00o0.toString();
    return ((String)localObject).compareToIgnoreCase(paramPreference);
  }
  
  public void OooO0oO(Bundle paramBundle)
  {
    boolean bool1 = OooOOO0();
    if (bool1)
    {
      bool1 = false;
      this.o00o0o = false;
      Parcelable localParcelable = OooOoo();
      boolean bool2 = this.o00o0o;
      if (bool2)
      {
        if (localParcelable != null)
        {
          String str = this.o00o000;
          paramBundle.putParcelable(str, localParcelable);
        }
      }
      else
      {
        paramBundle = new java/lang/IllegalStateException;
        paramBundle.<init>("Derived class did not call super.onSaveInstanceState()");
        throw paramBundle;
      }
    }
  }
  
  public final void OooO0oo()
  {
    Object localObject = getPreferenceDataStore();
    boolean bool1 = true;
    if (localObject != null)
    {
      localObject = this.o00o00oO;
      OooOooo(bool1, localObject);
      return;
    }
    boolean bool2 = OoooO0O();
    if (bool2)
    {
      localObject = getSharedPreferences();
      String str = this.o00o000;
      bool2 = ((SharedPreferences)localObject).contains(str);
      if (bool2)
      {
        bool2 = false;
        localObject = null;
        break label77;
      }
    }
    localObject = this.o00o00oO;
    if (localObject != null)
    {
      bool1 = false;
      label77:
      OooOooo(bool1, localObject);
    }
  }
  
  public boolean OooOO0(boolean paramBoolean)
  {
    boolean bool = OoooO0O();
    if (!bool) {
      return paramBoolean;
    }
    Object localObject = getPreferenceDataStore();
    if (localObject != null)
    {
      str = this.o00o000;
      return ((PreferenceDataStore)localObject).OooO00o(str, paramBoolean);
    }
    localObject = this.o00Ooo00.getSharedPreferences();
    String str = this.o00o000;
    return ((SharedPreferences)localObject).getBoolean(str, paramBoolean);
  }
  
  public String OooOO0O(String paramString)
  {
    boolean bool = OoooO0O();
    if (!bool) {
      return paramString;
    }
    Object localObject = getPreferenceDataStore();
    if (localObject != null)
    {
      str = this.o00o000;
      return ((PreferenceDataStore)localObject).OooO0OO(str, paramString);
    }
    localObject = this.o00Ooo00.getSharedPreferences();
    String str = this.o00o000;
    return ((SharedPreferences)localObject).getString(str, paramString);
  }
  
  public Set OooOO0o(Set paramSet)
  {
    boolean bool = OoooO0O();
    if (!bool) {
      return paramSet;
    }
    Object localObject = getPreferenceDataStore();
    if (localObject != null)
    {
      str = this.o00o000;
      return ((PreferenceDataStore)localObject).OooO0Oo(str, paramSet);
    }
    localObject = this.o00Ooo00.getSharedPreferences();
    String str = this.o00o000;
    return ((SharedPreferences)localObject).getStringSet(str, paramSet);
  }
  
  public void OooOOO()
  {
    Preference.OnPreferenceChangeInternalListener localOnPreferenceChangeInternalListener = this.o00o0Ooo;
    if (localOnPreferenceChangeInternalListener != null) {
      localOnPreferenceChangeInternalListener.OooO0o(this);
    }
  }
  
  public boolean OooOOO0()
  {
    return TextUtils.isEmpty(this.o00o000) ^ true;
  }
  
  public void OooOOOO(boolean paramBoolean)
  {
    List localList = this.o00o0o00;
    if (localList == null) {
      return;
    }
    int i = localList.size();
    int j = 0;
    while (j < i)
    {
      Preference localPreference = (Preference)localList.get(j);
      localPreference.OooOo0O(this, paramBoolean);
      j += 1;
    }
  }
  
  public void OooOOOo()
  {
    Preference.OnPreferenceChangeInternalListener localOnPreferenceChangeInternalListener = this.o00o0Ooo;
    if (localOnPreferenceChangeInternalListener != null) {
      localOnPreferenceChangeInternalListener.OooO0O0(this);
    }
  }
  
  public void OooOOo(PreferenceManager paramPreferenceManager)
  {
    this.o00Ooo00 = paramPreferenceManager;
    boolean bool = this.o00Ooo0o;
    if (!bool)
    {
      long l = paramPreferenceManager.getNextId();
      this.o00Ooo0O = l;
    }
    OooO0oo();
  }
  
  public void OooOOo0()
  {
    Oooo0o0();
  }
  
  public void OooOOoo(PreferenceManager paramPreferenceManager, long paramLong)
  {
    this.o00Ooo0O = paramLong;
    this.o00Ooo0o = true;
    try
    {
      OooOOo(paramPreferenceManager);
      return;
    }
    finally
    {
      this.o00Ooo0o = false;
    }
  }
  
  public Object OooOo(TypedArray paramTypedArray, int paramInt)
  {
    return null;
  }
  
  public void OooOo0() {}
  
  public void OooOo00(PreferenceViewHolder paramPreferenceViewHolder)
  {
    View localView = paramPreferenceViewHolder.itemView;
    Object localObject1 = this.o00o0oOO;
    localView.setOnClickListener((View.OnClickListener)localObject1);
    int i = this.o00OooOo;
    localView.setId(i);
    i = 16908304;
    localObject1 = (TextView)paramPreferenceViewHolder.OooO0O0(i);
    boolean bool2 = false;
    Preference.OnPreferenceCopyListener localOnPreferenceCopyListener = null;
    int j = 8;
    boolean bool3;
    if (localObject1 != null)
    {
      localObject2 = getSummary();
      bool3 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool3)
      {
        ((TextView)localObject1).setText((CharSequence)localObject2);
        ((View)localObject1).setVisibility(0);
        i = ((TextView)localObject1).getCurrentTextColor();
        localObject1 = Integer.valueOf(i);
      }
      else
      {
        ((View)localObject1).setVisibility(j);
      }
    }
    else
    {
      i = 0;
      localObject1 = null;
    }
    int n = 16908310;
    float f = 2.387729E-038F;
    Object localObject2 = (TextView)paramPreferenceViewHolder.OooO0O0(n);
    Object localObject3;
    if (localObject2 != null)
    {
      localObject3 = getTitle();
      boolean bool4 = TextUtils.isEmpty((CharSequence)localObject3);
      if (!bool4)
      {
        ((TextView)localObject2).setText((CharSequence)localObject3);
        ((View)localObject2).setVisibility(0);
        bool3 = this.o00o0OO0;
        if (bool3)
        {
          bool3 = this.o00o0OO;
          ((TextView)localObject2).setSingleLine(bool3);
        }
        bool3 = isSelectable();
        if (!bool3)
        {
          bool3 = isEnabled();
          if ((bool3) && (localObject1 != null))
          {
            i = ((Integer)localObject1).intValue();
            ((TextView)localObject2).setTextColor(i);
          }
        }
      }
      else
      {
        ((View)localObject2).setVisibility(j);
      }
    }
    i = 16908294;
    localObject1 = (ImageView)paramPreferenceViewHolder.OooO0O0(i);
    n = 4;
    f = 5.605194E-045F;
    if (localObject1 != null)
    {
      int k = this.o00Ooooo;
      Object localObject4;
      if (k == 0)
      {
        localObject4 = this.o00o0000;
        if (localObject4 == null) {}
      }
      else
      {
        localObject4 = this.o00o0000;
        if (localObject4 == null)
        {
          localObject4 = this.o00OoOoo;
          localObject3 = AppCompatResources.OooO0O0((Context)localObject4, k);
          this.o00o0000 = ((Drawable)localObject3);
        }
        localObject3 = this.o00o0000;
        if (localObject3 != null) {
          ((ImageView)localObject1).setImageDrawable((Drawable)localObject3);
        }
      }
      localObject3 = this.o00o0000;
      if (localObject3 != null)
      {
        ((ImageView)localObject1).setVisibility(0);
      }
      else
      {
        int m = this.o00o0OOO;
        if (m != 0) {
          m = n;
        } else {
          m = j;
        }
        ((ImageView)localObject1).setVisibility(m);
      }
    }
    i = R.id.icon_frame;
    localObject1 = paramPreferenceViewHolder.OooO0O0(i);
    if (localObject1 == null)
    {
      i = 16908350;
      localObject1 = paramPreferenceViewHolder.OooO0O0(i);
    }
    if (localObject1 != null)
    {
      localObject3 = this.o00o0000;
      if (localObject3 != null)
      {
        ((View)localObject1).setVisibility(0);
      }
      else
      {
        bool2 = this.o00o0OOO;
        if (bool2) {
          j = n;
        }
        ((View)localObject1).setVisibility(j);
      }
    }
    boolean bool1 = this.o00o0Oo0;
    if (bool1) {
      bool1 = isEnabled();
    } else {
      bool1 = true;
    }
    OoooO00(localView, bool1);
    bool1 = isSelectable();
    localView.setFocusable(bool1);
    localView.setClickable(bool1);
    bool2 = this.o00o0O0;
    paramPreferenceViewHolder.setDividerAllowedAbove(bool2);
    bool2 = this.o00o0O0O;
    paramPreferenceViewHolder.setDividerAllowedBelow(bool2);
    boolean bool5 = isCopyingEnabled();
    if (bool5)
    {
      localOnPreferenceCopyListener = this.o00o0oO0;
      if (localOnPreferenceCopyListener == null)
      {
        localOnPreferenceCopyListener = new androidx/preference/Preference$OnPreferenceCopyListener;
        localOnPreferenceCopyListener.<init>(this);
        this.o00o0oO0 = localOnPreferenceCopyListener;
      }
    }
    if (bool5)
    {
      localOnPreferenceCopyListener = this.o00o0oO0;
    }
    else
    {
      bool2 = false;
      localOnPreferenceCopyListener = null;
    }
    localView.setOnCreateContextMenuListener(localOnPreferenceCopyListener);
    localView.setLongClickable(bool5);
    if ((bool5) && (!bool1)) {
      ViewCompat.o0ooOoO(localView, null);
    }
  }
  
  public void OooOo0O(Preference paramPreference, boolean paramBoolean)
  {
    boolean bool = this.o00o00oo;
    if (bool == paramBoolean)
    {
      bool = paramBoolean ^ true;
      this.o00o00oo = bool;
      bool = OoooO0();
      OooOOOO(bool);
      OooOOO();
    }
  }
  
  public void OooOo0o()
  {
    OoooOO0();
    this.o00o0o0o = true;
  }
  
  public void OooOoO(Preference paramPreference, boolean paramBoolean)
  {
    boolean bool = this.o00o0;
    if (bool == paramBoolean)
    {
      bool = paramBoolean ^ true;
      this.o00o0 = bool;
      bool = OoooO0();
      OooOOOO(bool);
      OooOOO();
    }
  }
  
  public void OooOoO0(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat) {}
  
  public void OooOoOO()
  {
    OoooOO0();
  }
  
  public Parcelable OooOoo()
  {
    this.o00o0o = true;
    return AbsSavedState.EMPTY_STATE;
  }
  
  public void OooOoo0(Parcelable paramParcelable)
  {
    boolean bool = true;
    this.o00o0o = bool;
    AbsSavedState localAbsSavedState = AbsSavedState.EMPTY_STATE;
    if ((paramParcelable != localAbsSavedState) && (paramParcelable != null))
    {
      paramParcelable = new java/lang/IllegalArgumentException;
      paramParcelable.<init>("Wrong state class -- expecting Preference State");
      throw paramParcelable;
    }
  }
  
  public void OooOooO(Object paramObject) {}
  
  public void OooOooo(boolean paramBoolean, Object paramObject)
  {
    OooOooO(paramObject);
  }
  
  public void Oooo(Bundle paramBundle)
  {
    OooO0oO(paramBundle);
  }
  
  public boolean Oooo0(int paramInt)
  {
    boolean bool1 = OoooO0O();
    if (!bool1) {
      return false;
    }
    int i = paramInt ^ 0xFFFFFFFF;
    i = getPersistedInt(i);
    boolean bool2 = true;
    if (paramInt == i) {
      return bool2;
    }
    Object localObject = getPreferenceDataStore();
    String str;
    if (localObject != null)
    {
      str = this.o00o000;
      ((PreferenceDataStore)localObject).OooO0o(str, paramInt);
    }
    else
    {
      localObject = this.o00Ooo00.getEditor();
      str = this.o00o000;
      ((SharedPreferences.Editor)localObject).putInt(str, paramInt);
      OoooO((SharedPreferences.Editor)localObject);
    }
    return bool2;
  }
  
  public void Oooo000()
  {
    boolean bool = isEnabled();
    if (bool)
    {
      bool = isSelectable();
      if (bool)
      {
        OooOo0();
        Object localObject = this.o00OooO;
        if (localObject != null)
        {
          bool = ((Preference.OnPreferenceClickListener)localObject).OooO0o0(this);
          if (bool) {
            return;
          }
        }
        localObject = getPreferenceManager();
        if (localObject != null)
        {
          localObject = ((PreferenceManager)localObject).getOnPreferenceTreeClickListener();
          if (localObject != null)
          {
            bool = ((PreferenceManager.OnPreferenceTreeClickListener)localObject).OooOOO(this);
            if (bool) {
              return;
            }
          }
        }
        localObject = this.o00o000O;
        if (localObject != null)
        {
          localObject = getContext();
          Intent localIntent = this.o00o000O;
          ((Context)localObject).startActivity(localIntent);
        }
      }
    }
  }
  
  public void Oooo00O(View paramView)
  {
    Oooo000();
  }
  
  public boolean Oooo00o(boolean paramBoolean)
  {
    boolean bool1 = OoooO0O();
    if (!bool1) {
      return false;
    }
    bool1 = paramBoolean ^ true;
    bool1 = OooOO0(bool1);
    boolean bool2 = true;
    if (paramBoolean == bool1) {
      return bool2;
    }
    Object localObject = getPreferenceDataStore();
    String str;
    if (localObject != null)
    {
      str = this.o00o000;
      ((PreferenceDataStore)localObject).OooO0o0(str, paramBoolean);
    }
    else
    {
      localObject = this.o00Ooo00.getEditor();
      str = this.o00o000;
      ((SharedPreferences.Editor)localObject).putBoolean(str, paramBoolean);
      OoooO((SharedPreferences.Editor)localObject);
    }
    return bool2;
  }
  
  public boolean Oooo0O0(String paramString)
  {
    boolean bool1 = OoooO0O();
    if (!bool1) {
      return false;
    }
    Object localObject = OooOO0O(null);
    bool1 = TextUtils.equals(paramString, (CharSequence)localObject);
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    localObject = getPreferenceDataStore();
    String str;
    if (localObject != null)
    {
      str = this.o00o000;
      ((PreferenceDataStore)localObject).OooO0oO(str, paramString);
    }
    else
    {
      localObject = this.o00Ooo00.getEditor();
      str = this.o00o000;
      ((SharedPreferences.Editor)localObject).putString(str, paramString);
      OoooO((SharedPreferences.Editor)localObject);
    }
    return bool2;
  }
  
  public boolean Oooo0OO(Set paramSet)
  {
    boolean bool1 = OoooO0O();
    if (!bool1) {
      return false;
    }
    Object localObject = OooOO0o(null);
    bool1 = paramSet.equals(localObject);
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    localObject = getPreferenceDataStore();
    String str;
    if (localObject != null)
    {
      str = this.o00o000;
      ((PreferenceDataStore)localObject).OooO0oo(str, paramSet);
    }
    else
    {
      localObject = this.o00Ooo00.getEditor();
      str = this.o00o000;
      ((SharedPreferences.Editor)localObject).putStringSet(str, paramSet);
      OoooO((SharedPreferences.Editor)localObject);
    }
    return bool2;
  }
  
  public final void Oooo0o(Preference paramPreference)
  {
    Object localObject = this.o00o0o00;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.o00o0o00 = ((List)localObject);
    }
    this.o00o0o00.add(paramPreference);
    boolean bool = OoooO0();
    paramPreference.OooOo0O(this, bool);
  }
  
  public final void Oooo0o0()
  {
    Object localObject1 = this.o00o00o;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    if (bool) {
      return;
    }
    localObject1 = this.o00o00o;
    localObject1 = OooO((String)localObject1);
    if (localObject1 != null)
    {
      ((Preference)localObject1).Oooo0o(this);
      return;
    }
    localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Dependency \"");
    Object localObject3 = this.o00o00o;
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append("\" not found for preference \"");
    localObject3 = this.o00o000;
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append("\" (title: \"");
    localObject3 = this.o0O00o0;
    ((StringBuilder)localObject2).append(localObject3);
    ((StringBuilder)localObject2).append("\"");
    localObject2 = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public void Oooo0oO()
  {
    Object localObject = this.o00o000;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool)
    {
      this.o00o00Oo = true;
      return;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("Preference does not have a key assigned.");
    throw ((Throwable)localObject);
  }
  
  public void Oooo0oo(Bundle paramBundle)
  {
    OooO0o(paramBundle);
  }
  
  public final void OoooO(SharedPreferences.Editor paramEditor)
  {
    PreferenceManager localPreferenceManager = this.o00Ooo00;
    boolean bool = localPreferenceManager.OooO0o();
    if (bool) {
      paramEditor.apply();
    }
  }
  
  public boolean OoooO0()
  {
    return isEnabled() ^ true;
  }
  
  public final void OoooO00(View paramView, boolean paramBoolean)
  {
    paramView.setEnabled(paramBoolean);
    boolean bool = paramView instanceof ViewGroup;
    if (bool)
    {
      paramView = (ViewGroup)paramView;
      int i = paramView.getChildCount() + -1;
      while (i >= 0)
      {
        View localView = paramView.getChildAt(i);
        OoooO00(localView, paramBoolean);
        i += -1;
      }
    }
  }
  
  public boolean OoooO0O()
  {
    PreferenceManager localPreferenceManager = this.o00Ooo00;
    if (localPreferenceManager != null)
    {
      bool = isPersistent();
      if (bool)
      {
        bool = OooOOO0();
        if (bool) {
          return true;
        }
      }
    }
    boolean bool = false;
    localPreferenceManager = null;
    return bool;
  }
  
  public final void OoooOO0()
  {
    Object localObject = this.o00o00o;
    if (localObject != null)
    {
      localObject = OooO((String)localObject);
      if (localObject != null) {
        ((Preference)localObject).o000oOoO(this);
      }
    }
  }
  
  public final boolean OoooOOO()
  {
    return this.o00o0o0o;
  }
  
  public Context getContext()
  {
    return this.o00OoOoo;
  }
  
  public String getDependency()
  {
    return this.o00o00o;
  }
  
  public Bundle getExtras()
  {
    Bundle localBundle = this.oo00oO;
    if (localBundle == null)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      this.oo00oO = localBundle;
    }
    return this.oo00oO;
  }
  
  public StringBuilder getFilterableStringBuilder()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    CharSequence localCharSequence = getTitle();
    boolean bool = TextUtils.isEmpty(localCharSequence);
    char c = ' ';
    if (!bool)
    {
      localStringBuilder.append(localCharSequence);
      localStringBuilder.append(c);
    }
    localCharSequence = getSummary();
    bool = TextUtils.isEmpty(localCharSequence);
    if (!bool)
    {
      localStringBuilder.append(localCharSequence);
      localStringBuilder.append(c);
    }
    int i = localStringBuilder.length();
    if (i > 0)
    {
      i = localStringBuilder.length() + -1;
      localStringBuilder.setLength(i);
    }
    return localStringBuilder;
  }
  
  public String getFragment()
  {
    return this.o00o000o;
  }
  
  public Drawable getIcon()
  {
    Drawable localDrawable = this.o00o0000;
    if (localDrawable == null)
    {
      int i = this.o00Ooooo;
      if (i != 0)
      {
        Context localContext = this.o00OoOoo;
        localDrawable = AppCompatResources.OooO0O0(localContext, i);
        this.o00o0000 = localDrawable;
      }
    }
    return this.o00o0000;
  }
  
  public long getId()
  {
    return this.o00Ooo0O;
  }
  
  public Intent getIntent()
  {
    return this.o00o000O;
  }
  
  public String getKey()
  {
    return this.o00o000;
  }
  
  public final int getLayoutResource()
  {
    return this.o00o0Oo;
  }
  
  public Preference.OnPreferenceChangeListener getOnPreferenceChangeListener()
  {
    return this.o00OooO0;
  }
  
  public Preference.OnPreferenceClickListener getOnPreferenceClickListener()
  {
    return this.o00OooO;
  }
  
  public int getOrder()
  {
    return this.o00OooOO;
  }
  
  public PreferenceGroup getParent()
  {
    return this.o00o0o0O;
  }
  
  public int getPersistedInt(int paramInt)
  {
    boolean bool = OoooO0O();
    if (!bool) {
      return paramInt;
    }
    Object localObject = getPreferenceDataStore();
    if (localObject != null)
    {
      str = this.o00o000;
      return ((PreferenceDataStore)localObject).OooO0O0(str, paramInt);
    }
    localObject = this.o00Ooo00.getSharedPreferences();
    String str = this.o00o000;
    return ((SharedPreferences)localObject).getInt(str, paramInt);
  }
  
  public PreferenceDataStore getPreferenceDataStore()
  {
    Object localObject = this.o00Ooo0;
    if (localObject != null) {
      return localObject;
    }
    localObject = this.o00Ooo00;
    if (localObject != null) {
      return ((PreferenceManager)localObject).getPreferenceDataStore();
    }
    return null;
  }
  
  public PreferenceManager getPreferenceManager()
  {
    return this.o00Ooo00;
  }
  
  public SharedPreferences getSharedPreferences()
  {
    Object localObject = this.o00Ooo00;
    if (localObject != null)
    {
      localObject = getPreferenceDataStore();
      if (localObject == null) {
        return this.o00Ooo00.getSharedPreferences();
      }
    }
    return null;
  }
  
  public boolean getShouldDisableView()
  {
    return this.o00o0Oo0;
  }
  
  public CharSequence getSummary()
  {
    Preference.SummaryProvider localSummaryProvider = getSummaryProvider();
    if (localSummaryProvider != null) {
      return getSummaryProvider().OooO00o(this);
    }
    return this.o00OoooO;
  }
  
  public final Preference.SummaryProvider getSummaryProvider()
  {
    return this.o00o0oO;
  }
  
  public CharSequence getTitle()
  {
    return this.o0O00o0;
  }
  
  public final int getWidgetLayoutResource()
  {
    return this.o00o0OoO;
  }
  
  public boolean isCopyingEnabled()
  {
    return this.o00o0OOo;
  }
  
  public boolean isEnabled()
  {
    boolean bool = this.o00o00;
    if (bool)
    {
      bool = this.o00o00oo;
      if (bool)
      {
        bool = this.o00o0;
        if (bool) {
          return true;
        }
      }
    }
    bool = false;
    return bool;
  }
  
  public boolean isIconSpaceReserved()
  {
    return this.o00o0OOO;
  }
  
  public boolean isPersistent()
  {
    return this.o00o00o0;
  }
  
  public boolean isSelectable()
  {
    return this.o00o00O0;
  }
  
  public final boolean isShown()
  {
    boolean bool = isVisible();
    if (!bool) {
      return false;
    }
    Object localObject = getPreferenceManager();
    if (localObject == null) {
      return false;
    }
    localObject = getPreferenceManager().getPreferenceScreen();
    if (this == localObject) {
      return true;
    }
    localObject = getParent();
    if (localObject == null) {
      return false;
    }
    return ((Preference)localObject).isShown();
  }
  
  public boolean isSingleLineTitle()
  {
    return this.o00o0OO;
  }
  
  public final boolean isVisible()
  {
    return this.o00o0O00;
  }
  
  public final void o000oOoO(Preference paramPreference)
  {
    List localList = this.o00o0o00;
    if (localList != null) {
      localList.remove(paramPreference);
    }
  }
  
  public void setCopyingEnabled(boolean paramBoolean)
  {
    boolean bool = this.o00o0OOo;
    if (bool != paramBoolean)
    {
      this.o00o0OOo = paramBoolean;
      OooOOO();
    }
  }
  
  public void setDefaultValue(Object paramObject)
  {
    this.o00o00oO = paramObject;
  }
  
  public void setDependency(String paramString)
  {
    OoooOO0();
    this.o00o00o = paramString;
    Oooo0o0();
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    boolean bool = this.o00o00;
    if (bool != paramBoolean)
    {
      this.o00o00 = paramBoolean;
      paramBoolean = OoooO0();
      OooOOOO(paramBoolean);
      OooOOO();
    }
  }
  
  public void setFragment(String paramString)
  {
    this.o00o000o = paramString;
  }
  
  public void setIcon(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.OooO0O0(this.o00OoOoo, paramInt);
    setIcon(localDrawable);
    this.o00Ooooo = paramInt;
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    Drawable localDrawable = this.o00o0000;
    if (localDrawable != paramDrawable)
    {
      this.o00o0000 = paramDrawable;
      paramDrawable = null;
      this.o00Ooooo = 0;
      OooOOO();
    }
  }
  
  public void setIconSpaceReserved(boolean paramBoolean)
  {
    boolean bool = this.o00o0OOO;
    if (bool != paramBoolean)
    {
      this.o00o0OOO = paramBoolean;
      OooOOO();
    }
  }
  
  public void setIntent(Intent paramIntent)
  {
    this.o00o000O = paramIntent;
  }
  
  public void setKey(String paramString)
  {
    this.o00o000 = paramString;
    boolean bool = this.o00o00Oo;
    if (bool)
    {
      bool = OooOOO0();
      if (!bool) {
        Oooo0oO();
      }
    }
  }
  
  public void setLayoutResource(int paramInt)
  {
    this.o00o0Oo = paramInt;
  }
  
  public final void setOnPreferenceChangeInternalListener(Preference.OnPreferenceChangeInternalListener paramOnPreferenceChangeInternalListener)
  {
    this.o00o0Ooo = paramOnPreferenceChangeInternalListener;
  }
  
  public void setOnPreferenceChangeListener(Preference.OnPreferenceChangeListener paramOnPreferenceChangeListener)
  {
    this.o00OooO0 = paramOnPreferenceChangeListener;
  }
  
  public void setOnPreferenceClickListener(Preference.OnPreferenceClickListener paramOnPreferenceClickListener)
  {
    this.o00OooO = paramOnPreferenceClickListener;
  }
  
  public void setOrder(int paramInt)
  {
    int i = this.o00OooOO;
    if (paramInt != i)
    {
      this.o00OooOO = paramInt;
      OooOOOo();
    }
  }
  
  public void setPersistent(boolean paramBoolean)
  {
    this.o00o00o0 = paramBoolean;
  }
  
  public void setPreferenceDataStore(PreferenceDataStore paramPreferenceDataStore)
  {
    this.o00Ooo0 = paramPreferenceDataStore;
  }
  
  public void setSelectable(boolean paramBoolean)
  {
    boolean bool = this.o00o00O0;
    if (bool != paramBoolean)
    {
      this.o00o00O0 = paramBoolean;
      OooOOO();
    }
  }
  
  public void setShouldDisableView(boolean paramBoolean)
  {
    boolean bool = this.o00o0Oo0;
    if (bool != paramBoolean)
    {
      this.o00o0Oo0 = paramBoolean;
      OooOOO();
    }
  }
  
  public void setSingleLineTitle(boolean paramBoolean)
  {
    this.o00o0OO0 = true;
    this.o00o0OO = paramBoolean;
  }
  
  public void setSummary(int paramInt)
  {
    String str = this.o00OoOoo.getString(paramInt);
    setSummary(str);
  }
  
  public void setSummary(CharSequence paramCharSequence)
  {
    Object localObject = getSummaryProvider();
    if (localObject == null)
    {
      localObject = this.o00OoooO;
      boolean bool = TextUtils.equals((CharSequence)localObject, paramCharSequence);
      if (!bool)
      {
        this.o00OoooO = paramCharSequence;
        OooOOO();
      }
      return;
    }
    paramCharSequence = new java/lang/IllegalStateException;
    paramCharSequence.<init>("Preference already has a SummaryProvider set.");
    throw paramCharSequence;
  }
  
  public final void setSummaryProvider(Preference.SummaryProvider paramSummaryProvider)
  {
    this.o00o0oO = paramSummaryProvider;
    OooOOO();
  }
  
  public void setTitle(int paramInt)
  {
    String str = this.o00OoOoo.getString(paramInt);
    setTitle(str);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    CharSequence localCharSequence = this.o0O00o0;
    boolean bool = TextUtils.equals(paramCharSequence, localCharSequence);
    if (!bool)
    {
      this.o0O00o0 = paramCharSequence;
      OooOOO();
    }
  }
  
  public void setViewId(int paramInt)
  {
    this.o00OooOo = paramInt;
  }
  
  public final void setVisible(boolean paramBoolean)
  {
    boolean bool = this.o00o0O00;
    if (bool != paramBoolean)
    {
      this.o00o0O00 = paramBoolean;
      Preference.OnPreferenceChangeInternalListener localOnPreferenceChangeInternalListener = this.o00o0Ooo;
      if (localOnPreferenceChangeInternalListener != null) {
        localOnPreferenceChangeInternalListener.OooO0Oo(this);
      }
    }
  }
  
  public void setWidgetLayoutResource(int paramInt)
  {
    this.o00o0OoO = paramInt;
  }
  
  public String toString()
  {
    return getFilterableStringBuilder().toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.Preference
 * JD-Core Version:    0.7.0.1
 */