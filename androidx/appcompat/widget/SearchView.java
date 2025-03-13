package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.view.ViewCompat;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import java.util.WeakHashMap;

public class SearchView
  extends LinearLayoutCompat
  implements CollapsibleActionView
{
  public static final SearchView.PreQAutoCompleteTextViewReflector o00oO00O;
  public final SearchView.SearchAutoComplete o00OoOoo;
  public final View o00Ooo0;
  public final View o00Ooo00;
  public final View o00Ooo0O;
  public final ImageView o00Ooo0o;
  public final ImageView o00OooO;
  public final ImageView o00OooO0;
  public final ImageView o00OooOO;
  public final View o00OooOo;
  public Rect o00OoooO;
  public Rect o00Ooooo;
  public final AdapterView.OnItemClickListener o00o;
  public SearchView.OnSuggestionListener o00o0;
  public final int o00o00;
  public int[] o00o000;
  public int[] o00o0000;
  public final ImageView o00o000O;
  public final Drawable o00o000o;
  public final Intent o00o00O0;
  public final Intent o00o00Oo;
  public SearchView.OnQueryTextListener o00o00o;
  public final CharSequence o00o00o0;
  public SearchView.OnCloseListener o00o00oO;
  public View.OnFocusChangeListener o00o00oo;
  public boolean o00o0O0;
  public View.OnClickListener o00o0O00;
  public boolean o00o0O0O;
  public boolean o00o0OO;
  public CursorAdapter o00o0OO0;
  public CharSequence o00o0OOO;
  public boolean o00o0OOo;
  public int o00o0Oo;
  public boolean o00o0Oo0;
  public boolean o00o0OoO;
  public CharSequence o00o0Ooo;
  public SearchableInfo o00o0o;
  public CharSequence o00o0o00;
  public boolean o00o0o0O;
  public int o00o0o0o;
  public final Runnable o00o0oO;
  public Bundle o00o0oO0;
  public Runnable o00o0oOO;
  public final WeakHashMap o00o0oOo;
  public View.OnKeyListener o00o0oo;
  public final View.OnClickListener o00o0oo0;
  public final TextView.OnEditorActionListener o00o0ooo;
  public TextWatcher o00oO000;
  public final AdapterView.OnItemSelectedListener o00oo000;
  public SearchView.UpdatableTouchDelegate o0O00o0;
  public final int oo00oO;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    SearchView.PreQAutoCompleteTextViewReflector localPreQAutoCompleteTextViewReflector;
    if (i < j)
    {
      localPreQAutoCompleteTextViewReflector = new androidx/appcompat/widget/SearchView$PreQAutoCompleteTextViewReflector;
      localPreQAutoCompleteTextViewReflector.<init>();
    }
    else
    {
      i = 0;
      localPreQAutoCompleteTextViewReflector = null;
    }
    o00oO00O = localPreQAutoCompleteTextViewReflector;
  }
  
  public SearchView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.o00OoooO = ((Rect)localObject1);
    localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.o00Ooooo = ((Rect)localObject1);
    int i = 2;
    Object localObject2 = new int[i];
    this.o00o0000 = ((int[])localObject2);
    localObject1 = new int[i];
    this.o00o000 = ((int[])localObject1);
    localObject1 = new androidx/appcompat/widget/SearchView$1;
    ((SearchView.1)localObject1).<init>(this);
    this.o00o0oO = ((Runnable)localObject1);
    localObject1 = new androidx/appcompat/widget/SearchView$2;
    ((SearchView.2)localObject1).<init>(this);
    this.o00o0oOO = ((Runnable)localObject1);
    localObject1 = new java/util/WeakHashMap;
    ((WeakHashMap)localObject1).<init>();
    this.o00o0oOo = ((WeakHashMap)localObject1);
    SearchView.5 local5 = new androidx/appcompat/widget/SearchView$5;
    local5.<init>(this);
    this.o00o0oo0 = local5;
    localObject1 = new androidx/appcompat/widget/SearchView$6;
    ((SearchView.6)localObject1).<init>(this);
    this.o00o0oo = ((View.OnKeyListener)localObject1);
    SearchView.7 local7 = new androidx/appcompat/widget/SearchView$7;
    local7.<init>(this);
    this.o00o0ooo = local7;
    SearchView.8 local8 = new androidx/appcompat/widget/SearchView$8;
    local8.<init>(this);
    this.o00o = local8;
    SearchView.9 local9 = new androidx/appcompat/widget/SearchView$9;
    local9.<init>(this);
    this.o00oo000 = local9;
    localObject1 = new androidx/appcompat/widget/SearchView$10;
    ((SearchView.10)localObject1).<init>(this);
    this.o00oO000 = ((TextWatcher)localObject1);
    localObject1 = R.styleable.SearchView;
    Object localObject3 = paramContext;
    Object localObject4 = paramAttributeSet;
    int j = paramInt;
    TintTypedArray localTintTypedArray = TintTypedArray.OooOOOO(paramContext, paramAttributeSet, (int[])localObject1, paramInt, 0);
    Object localObject5 = R.styleable.SearchView;
    Object localObject6 = localTintTypedArray.getWrappedTypeArray();
    localObject1 = this;
    localObject2 = paramContext;
    ViewCompat.o00ooo(this, paramContext, (int[])localObject5, paramAttributeSet, (TypedArray)localObject6, paramInt, 0);
    localObject1 = LayoutInflater.from(paramContext);
    int k = R.styleable.SearchView_layout;
    int n = R.layout.abc_search_view;
    k = localTintTypedArray.OooOO0O(k, n);
    ((LayoutInflater)localObject1).inflate(k, this, true);
    i = R.id.search_src_text;
    localObject1 = (SearchView.SearchAutoComplete)findViewById(i);
    this.o00OoOoo = ((SearchView.SearchAutoComplete)localObject1);
    ((SearchView.SearchAutoComplete)localObject1).setSearchView(this);
    k = R.id.search_edit_frame;
    localObject2 = findViewById(k);
    this.o00Ooo00 = ((View)localObject2);
    k = R.id.search_plate;
    localObject2 = findViewById(k);
    this.o00Ooo0 = ((View)localObject2);
    int i1 = R.id.submit_area;
    localObject4 = findViewById(i1);
    this.o00Ooo0O = ((View)localObject4);
    int i2 = R.id.search_button;
    localObject6 = (ImageView)findViewById(i2);
    this.o00Ooo0o = ((ImageView)localObject6);
    j = R.id.search_go_btn;
    ImageView localImageView1 = (ImageView)findViewById(j);
    this.o00OooO0 = localImageView1;
    int i3 = R.id.search_close_btn;
    ImageView localImageView2 = (ImageView)findViewById(i3);
    this.o00OooO = localImageView2;
    int i4 = R.id.search_voice_btn;
    localObject3 = (ImageView)findViewById(i4);
    this.o00OooOO = ((ImageView)localObject3);
    int i5 = R.id.search_mag_icon;
    ImageView localImageView3 = (ImageView)findViewById(i5);
    this.o00o000O = localImageView3;
    n = R.styleable.SearchView_queryBackground;
    localObject5 = localTintTypedArray.getDrawable(n);
    ViewCompat.o0ooOoO((View)localObject2, (Drawable)localObject5);
    k = R.styleable.SearchView_submitBackground;
    localObject2 = localTintTypedArray.getDrawable(k);
    ViewCompat.o0ooOoO((View)localObject4, (Drawable)localObject2);
    k = R.styleable.SearchView_searchIcon;
    localObject2 = localTintTypedArray.getDrawable(k);
    ((ImageView)localObject6).setImageDrawable((Drawable)localObject2);
    k = R.styleable.SearchView_goIcon;
    localObject2 = localTintTypedArray.getDrawable(k);
    localImageView1.setImageDrawable((Drawable)localObject2);
    k = R.styleable.SearchView_closeIcon;
    localObject2 = localTintTypedArray.getDrawable(k);
    localImageView2.setImageDrawable((Drawable)localObject2);
    k = R.styleable.SearchView_voiceIcon;
    localObject2 = localTintTypedArray.getDrawable(k);
    ((ImageView)localObject3).setImageDrawable((Drawable)localObject2);
    k = R.styleable.SearchView_searchIcon;
    localObject2 = localTintTypedArray.getDrawable(k);
    localImageView3.setImageDrawable((Drawable)localObject2);
    k = R.styleable.SearchView_searchHintIcon;
    localObject2 = localTintTypedArray.getDrawable(k);
    this.o00o000o = ((Drawable)localObject2);
    localObject2 = getResources();
    n = R.string.abc_searchview_description_search;
    localObject2 = ((Resources)localObject2).getString(n);
    TooltipCompat.OooO00o((View)localObject6, (CharSequence)localObject2);
    k = R.styleable.SearchView_suggestionRowLayout;
    n = R.layout.abc_search_dropdown_item_icons_2line;
    k = localTintTypedArray.OooOO0O(k, n);
    this.oo00oO = k;
    k = R.styleable.SearchView_commitIcon;
    k = localTintTypedArray.OooOO0O(k, 0);
    this.o00o00 = k;
    ((View)localObject6).setOnClickListener(local5);
    localImageView2.setOnClickListener(local5);
    localImageView1.setOnClickListener(local5);
    ((View)localObject3).setOnClickListener(local5);
    ((View)localObject1).setOnClickListener(local5);
    localObject2 = this.o00oO000;
    ((TextView)localObject1).addTextChangedListener((TextWatcher)localObject2);
    ((TextView)localObject1).setOnEditorActionListener(local7);
    ((AutoCompleteTextView)localObject1).setOnItemClickListener(local8);
    ((AutoCompleteTextView)localObject1).setOnItemSelectedListener(local9);
    localObject2 = this.o00o0oo;
    ((View)localObject1).setOnKeyListener((View.OnKeyListener)localObject2);
    localObject2 = new androidx/appcompat/widget/SearchView$3;
    ((SearchView.3)localObject2).<init>(this);
    ((View)localObject1).setOnFocusChangeListener((View.OnFocusChangeListener)localObject2);
    k = R.styleable.SearchView_iconifiedByDefault;
    boolean bool2 = localTintTypedArray.OooO00o(k, true);
    setIconifiedByDefault(bool2);
    int m = R.styleable.SearchView_android_maxWidth;
    n = -1;
    m = localTintTypedArray.OooO0o0(m, n);
    if (m != n) {
      setMaxWidth(m);
    }
    m = R.styleable.SearchView_defaultQueryHint;
    localObject2 = localTintTypedArray.getText(m);
    localSearchView.o00o00o0 = ((CharSequence)localObject2);
    m = R.styleable.SearchView_queryHint;
    localObject2 = localTintTypedArray.getText(m);
    localSearchView.o00o0OOO = ((CharSequence)localObject2);
    m = R.styleable.SearchView_android_imeOptions;
    m = localTintTypedArray.OooO0oo(m, n);
    if (m != n) {
      localSearchView.setImeOptions(m);
    }
    m = R.styleable.SearchView_android_inputType;
    m = localTintTypedArray.OooO0oo(m, n);
    if (m != n) {
      localSearchView.setInputType(m);
    }
    m = R.styleable.SearchView_android_focusable;
    boolean bool3 = localTintTypedArray.OooO00o(m, true);
    localSearchView.setFocusable(bool3);
    localTintTypedArray.OooOOOo();
    localObject2 = new android/content/Intent;
    localObject5 = "android.speech.action.WEB_SEARCH";
    ((Intent)localObject2).<init>((String)localObject5);
    localSearchView.o00o00O0 = ((Intent)localObject2);
    n = 268435456;
    ((Intent)localObject2).addFlags(n);
    localObject6 = "web_search";
    ((Intent)localObject2).putExtra("android.speech.extra.LANGUAGE_MODEL", (String)localObject6);
    localObject2 = new android/content/Intent;
    localObject4 = "android.speech.action.RECOGNIZE_SPEECH";
    ((Intent)localObject2).<init>((String)localObject4);
    localSearchView.o00o00Oo = ((Intent)localObject2);
    ((Intent)localObject2).addFlags(n);
    i = ((AutoCompleteTextView)localObject1).getDropDownAnchor();
    localObject1 = localSearchView.findViewById(i);
    localSearchView.o00OooOo = ((View)localObject1);
    if (localObject1 != null)
    {
      localObject2 = new androidx/appcompat/widget/SearchView$4;
      ((SearchView.4)localObject2).<init>(localSearchView);
      ((View)localObject1).addOnLayoutChangeListener((View.OnLayoutChangeListener)localObject2);
    }
    boolean bool1 = localSearchView.o00o0O0;
    localSearchView.Oooo0oO(bool1);
    Oooo0O0();
  }
  
  public static boolean OooOOo0(Context paramContext)
  {
    paramContext = paramContext.getResources().getConfiguration();
    int i = paramContext.orientation;
    int j = 2;
    if (i == j)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramContext = null;
    }
    return i;
  }
  
  private int getPreferredHeight()
  {
    Resources localResources = getContext().getResources();
    int i = R.dimen.abc_search_view_preferred_height;
    return localResources.getDimensionPixelSize(i);
  }
  
  private int getPreferredWidth()
  {
    Resources localResources = getContext().getResources();
    int i = R.dimen.abc_search_view_preferred_width;
    return localResources.getDimensionPixelSize(i);
  }
  
  private boolean isSubmitAreaEnabled()
  {
    boolean bool = this.o00o0OO;
    if (!bool)
    {
      bool = this.o00o0OoO;
      if (!bool) {}
    }
    else
    {
      bool = isIconified();
      if (!bool) {
        return true;
      }
    }
    bool = false;
    return bool;
  }
  
  private void setQuery(CharSequence paramCharSequence)
  {
    this.o00OoOoo.setText(paramCharSequence);
    SearchView.SearchAutoComplete localSearchAutoComplete = this.o00OoOoo;
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    int i;
    if (bool)
    {
      i = 0;
      paramCharSequence = null;
    }
    else
    {
      i = paramCharSequence.length();
    }
    localSearchAutoComplete.setSelection(i);
  }
  
  public final Intent OooO(Cursor paramCursor, int paramInt, String paramString)
  {
    Object localObject1 = "suggest_intent_action";
    try
    {
      localObject1 = SuggestionsAdapter.OooOOO(paramCursor, (String)localObject1);
      if (localObject1 == null)
      {
        localObject1 = this.o00o0o;
        localObject1 = ((SearchableInfo)localObject1).getSuggestIntentAction();
      }
      if (localObject1 == null) {
        localObject1 = "android.intent.action.SEARCH";
      }
      Object localObject2 = localObject1;
      localObject1 = "suggest_intent_data";
      localObject1 = SuggestionsAdapter.OooOOO(paramCursor, (String)localObject1);
      if (localObject1 == null)
      {
        localObject1 = this.o00o0o;
        localObject1 = ((SearchableInfo)localObject1).getSuggestIntentData();
      }
      Object localObject4;
      if (localObject1 != null)
      {
        localObject3 = "suggest_intent_data_id";
        localObject3 = SuggestionsAdapter.OooOOO(paramCursor, (String)localObject3);
        if (localObject3 != null)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append((String)localObject1);
          localObject1 = "/";
          ((StringBuilder)localObject4).append((String)localObject1);
          localObject1 = Uri.encode((String)localObject3);
          ((StringBuilder)localObject4).append((String)localObject1);
          localObject1 = ((StringBuilder)localObject4).toString();
        }
      }
      if (localObject1 == null)
      {
        localObject4 = null;
      }
      else
      {
        localObject1 = Uri.parse((String)localObject1);
        localObject4 = localObject1;
      }
      localObject1 = "suggest_intent_query";
      String str1 = SuggestionsAdapter.OooOOO(paramCursor, (String)localObject1);
      localObject1 = "suggest_intent_extra_data";
      String str2 = SuggestionsAdapter.OooOOO(paramCursor, (String)localObject1);
      Object localObject3 = this;
      return OooO0oo(localObject2, (Uri)localObject4, str2, str1, paramInt, paramString);
    }
    catch (RuntimeException localRuntimeException1)
    {
      int i;
      try
      {
        i = paramCursor.getPosition();
      }
      catch (RuntimeException localRuntimeException2)
      {
        i = -1;
      }
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Search suggestions cursor at row ");
      localStringBuilder.append(i);
      localStringBuilder.append(" returned exception.");
    }
    return null;
  }
  
  public void OooO0O0()
  {
    boolean bool = this.o00o0o0O;
    if (bool) {
      return;
    }
    this.o00o0o0O = true;
    int i = this.o00OoOoo.getImeOptions();
    this.o00o0o0o = i;
    SearchView.SearchAutoComplete localSearchAutoComplete = this.o00OoOoo;
    i |= 0x2000000;
    localSearchAutoComplete.setImeOptions(i);
    this.o00OoOoo.setText("");
    setIconified(false);
  }
  
  public void OooO0OO()
  {
    Oooo00O("", false);
    clearFocus();
    Oooo0oO(true);
    SearchView.SearchAutoComplete localSearchAutoComplete = this.o00OoOoo;
    int i = this.o00o0o0o;
    localSearchAutoComplete.setImeOptions(i);
    this.o00o0o0O = false;
  }
  
  public void OooO0oO()
  {
    Object localObject1 = this.o00OooOo;
    int i = ((View)localObject1).getWidth();
    int j = 1;
    if (i > j)
    {
      localObject1 = getContext().getResources();
      Object localObject2 = this.o00Ooo0;
      j = ((View)localObject2).getPaddingLeft();
      Rect localRect = new android/graphics/Rect;
      localRect.<init>();
      boolean bool1 = ViewUtils.OooO0O0(this);
      boolean bool2 = this.o00o0O0;
      int m;
      if (bool2)
      {
        m = R.dimen.abc_dropdownitem_icon_width;
        m = ((Resources)localObject1).getDimensionPixelSize(m);
        int n = R.dimen.abc_dropdownitem_text_padding_left;
        i = ((Resources)localObject1).getDimensionPixelSize(n);
        m += i;
      }
      else
      {
        m = 0;
      }
      localObject1 = this.o00OoOoo.getDropDownBackground();
      ((Drawable)localObject1).getPadding(localRect);
      i = localRect.left;
      if (bool1)
      {
        i = -i;
      }
      else
      {
        i += m;
        i = j - i;
      }
      SearchView.SearchAutoComplete localSearchAutoComplete = this.o00OoOoo;
      localSearchAutoComplete.setDropDownHorizontalOffset(i);
      localObject1 = this.o00OooOo;
      i = ((View)localObject1).getWidth();
      int k = localRect.left;
      i += k;
      int i1 = localRect.right;
      i = i + i1 + m - j;
      localObject2 = this.o00OoOoo;
      ((AutoCompleteTextView)localObject2).setDropDownWidth(i);
    }
  }
  
  public final Intent OooO0oo(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramString1);
    int i = 268435456;
    localIntent.addFlags(i);
    if (paramUri != null) {
      localIntent.setData(paramUri);
    }
    paramString1 = "user_query";
    paramUri = this.o00o0o00;
    localIntent.putExtra(paramString1, paramUri);
    if (paramString3 != null)
    {
      paramString1 = "query";
      localIntent.putExtra(paramString1, paramString3);
    }
    if (paramString2 != null)
    {
      paramString1 = "intent_extra_data_key";
      localIntent.putExtra(paramString1, paramString2);
    }
    paramString1 = this.o00o0oO0;
    if (paramString1 != null)
    {
      paramUri = "app_data";
      localIntent.putExtra(paramUri, paramString1);
    }
    if (paramInt != 0)
    {
      localIntent.putExtra("action_key", paramInt);
      paramString1 = "action_msg";
      localIntent.putExtra(paramString1, paramString4);
    }
    paramString1 = this.o00o0o.getSearchActivity();
    localIntent.setComponent(paramString1);
    return localIntent;
  }
  
  public final Intent OooOO0(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    ComponentName localComponentName = paramSearchableInfo.getSearchActivity();
    Object localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>("android.intent.action.SEARCH");
    ((Intent)localObject1).setComponent(localComponentName);
    Object localObject2 = getContext();
    int i = 1107296256;
    localObject1 = PendingIntent.getActivity((Context)localObject2, 0, (Intent)localObject1, i);
    localObject2 = new android/os/Bundle;
    ((Bundle)localObject2).<init>();
    Object localObject3 = this.o00o0oO0;
    if (localObject3 != null)
    {
      str1 = "app_data";
      ((Bundle)localObject2).putParcelable(str1, (Parcelable)localObject3);
    }
    localObject3 = new android/content/Intent;
    ((Intent)localObject3).<init>(paramIntent);
    paramIntent = getResources();
    i = paramSearchableInfo.getVoiceLanguageModeId();
    if (i != 0)
    {
      i = paramSearchableInfo.getVoiceLanguageModeId();
      str1 = paramIntent.getString(i);
    }
    else
    {
      str1 = "free_form";
    }
    int j = paramSearchableInfo.getVoicePromptTextId();
    String str2 = null;
    String str3;
    if (j != 0)
    {
      j = paramSearchableInfo.getVoicePromptTextId();
      str3 = paramIntent.getString(j);
    }
    else
    {
      j = 0;
      str3 = null;
    }
    int k = paramSearchableInfo.getVoiceLanguageId();
    if (k != 0)
    {
      k = paramSearchableInfo.getVoiceLanguageId();
      paramIntent = paramIntent.getString(k);
    }
    else
    {
      paramIntent = null;
    }
    k = paramSearchableInfo.getVoiceMaxResults();
    int m;
    if (k != 0) {
      m = paramSearchableInfo.getVoiceMaxResults();
    } else {
      m = 1;
    }
    String str4 = "android.speech.extra.LANGUAGE_MODEL";
    ((Intent)localObject3).putExtra(str4, str1);
    ((Intent)localObject3).putExtra("android.speech.extra.PROMPT", str3);
    String str1 = "android.speech.extra.LANGUAGE";
    ((Intent)localObject3).putExtra(str1, paramIntent);
    paramIntent = "android.speech.extra.MAX_RESULTS";
    ((Intent)localObject3).putExtra(paramIntent, m);
    if (localComponentName != null) {
      str2 = localComponentName.flattenToShortString();
    }
    ((Intent)localObject3).putExtra("calling_package", str2);
    ((Intent)localObject3).putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)localObject1);
    ((Intent)localObject3).putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", (Bundle)localObject2);
    return localObject3;
  }
  
  public final Intent OooOO0O(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramIntent);
    paramIntent = paramSearchableInfo.getSearchActivity();
    if (paramIntent == null) {
      paramIntent = null;
    } else {
      paramIntent = paramIntent.flattenToShortString();
    }
    localIntent.putExtra("calling_package", paramIntent);
    return localIntent;
  }
  
  public final void OooOO0o()
  {
    this.o00OoOoo.dismissDropDown();
  }
  
  public final void OooOOO(View paramView, Rect paramRect)
  {
    int[] arrayOfInt1 = this.o00o0000;
    paramView.getLocationInWindow(arrayOfInt1);
    arrayOfInt1 = this.o00o000;
    getLocationInWindow(arrayOfInt1);
    arrayOfInt1 = this.o00o0000;
    int i = 1;
    int j = arrayOfInt1[i];
    int[] arrayOfInt2 = this.o00o000;
    i = arrayOfInt2[i];
    j -= i;
    int k = arrayOfInt1[0];
    i = arrayOfInt2[0];
    k -= i;
    i = paramView.getWidth() + k;
    int m = paramView.getHeight() + j;
    paramRect.set(k, j, i, m);
  }
  
  public void OooOOO0()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    Object localObject;
    if (i >= j)
    {
      localObject = this.o00OoOoo;
      SearchView.Api29Impl.OooO00o((AutoCompleteTextView)localObject);
    }
    else
    {
      localObject = o00oO00O;
      SearchView.SearchAutoComplete localSearchAutoComplete = this.o00OoOoo;
      ((SearchView.PreQAutoCompleteTextViewReflector)localObject).OooO0O0(localSearchAutoComplete);
      localSearchAutoComplete = this.o00OoOoo;
      ((SearchView.PreQAutoCompleteTextViewReflector)localObject).OooO00o(localSearchAutoComplete);
    }
  }
  
  public final CharSequence OooOOOO(CharSequence paramCharSequence)
  {
    boolean bool = this.o00o0O0;
    if (bool)
    {
      Object localObject = this.o00o000o;
      if (localObject != null)
      {
        int i = (int)(this.o00OoOoo.getTextSize() * 1.25D);
        this.o00o000o.setBounds(0, 0, i, i);
        localObject = new android/text/SpannableStringBuilder;
        ((SpannableStringBuilder)localObject).<init>("   ");
        ImageSpan localImageSpan = new android/text/style/ImageSpan;
        Drawable localDrawable = this.o00o000o;
        localImageSpan.<init>(localDrawable);
        ((SpannableStringBuilder)localObject).setSpan(localImageSpan, 1, 2, 33);
        ((SpannableStringBuilder)localObject).append(paramCharSequence);
        return localObject;
      }
    }
    return paramCharSequence;
  }
  
  public final boolean OooOOOo()
  {
    Object localObject = this.o00o0o;
    boolean bool1 = false;
    if (localObject != null)
    {
      boolean bool2 = ((SearchableInfo)localObject).getVoiceSearchEnabled();
      if (bool2)
      {
        localObject = this.o00o0o;
        bool2 = ((SearchableInfo)localObject).getVoiceSearchLaunchWebSearch();
        if (bool2)
        {
          localObject = this.o00o00O0;
        }
        else
        {
          localObject = this.o00o0o;
          bool2 = ((SearchableInfo)localObject).getVoiceSearchLaunchRecognizer();
          if (bool2)
          {
            localObject = this.o00o00Oo;
          }
          else
          {
            bool2 = false;
            localObject = null;
          }
        }
        if (localObject != null)
        {
          PackageManager localPackageManager = getContext().getPackageManager();
          int i = 65536;
          localObject = localPackageManager.resolveActivity((Intent)localObject, i);
          if (localObject != null) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public final void OooOOo(Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    try
    {
      localObject = getContext();
      ((Context)localObject).startActivity(paramIntent);
    }
    catch (RuntimeException localRuntimeException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "Failed launch activity: ";
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(paramIntent);
    }
  }
  
  public void OooOOoo(int paramInt, String paramString1, String paramString2)
  {
    Intent localIntent = OooO0oo("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(localIntent);
  }
  
  public void OooOo(CharSequence paramCharSequence)
  {
    setQuery(paramCharSequence);
  }
  
  public void OooOo0()
  {
    Object localObject = this.o00OoOoo.getText();
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject);
    boolean bool2 = true;
    if (bool1)
    {
      bool1 = this.o00o0O0;
      if (bool1)
      {
        localObject = this.o00o00oO;
        if (localObject != null)
        {
          bool1 = ((SearchView.OnCloseListener)localObject).OooO00o();
          if (bool1) {}
        }
        else
        {
          clearFocus();
          Oooo0oO(bool2);
        }
      }
    }
    else
    {
      localObject = this.o00OoOoo;
      String str = "";
      ((TextView)localObject).setText(str);
      this.o00OoOoo.requestFocus();
      localObject = this.o00OoOoo;
      ((SearchView.SearchAutoComplete)localObject).setImeVisibility(bool2);
    }
  }
  
  public final boolean OooOo00(int paramInt1, int paramInt2, String paramString)
  {
    Cursor localCursor = this.o00o0OO0.getCursor();
    if (localCursor != null)
    {
      paramInt1 = localCursor.moveToPosition(paramInt1);
      if (paramInt1 != 0)
      {
        Intent localIntent = OooO(localCursor, paramInt2, paramString);
        OooOOo(localIntent);
        return true;
      }
    }
    return false;
  }
  
  public boolean OooOo0O(int paramInt1, int paramInt2, String paramString)
  {
    SearchView.OnSuggestionListener localOnSuggestionListener = this.o00o0;
    if (localOnSuggestionListener != null)
    {
      paramInt2 = localOnSuggestionListener.OooO0O0(paramInt1);
      if (paramInt2 != 0) {
        return false;
      }
    }
    OooOo00(paramInt1, 0, null);
    this.o00OoOoo.setImeVisibility(false);
    OooOO0o();
    return true;
  }
  
  public boolean OooOo0o(int paramInt)
  {
    SearchView.OnSuggestionListener localOnSuggestionListener = this.o00o0;
    if (localOnSuggestionListener != null)
    {
      boolean bool = localOnSuggestionListener.OooO00o(paramInt);
      if (bool) {
        return false;
      }
    }
    Oooo000(paramInt);
    return true;
  }
  
  public void OooOoO()
  {
    Object localObject1 = this.o00OoOoo.getText();
    if (localObject1 != null)
    {
      int i = TextUtils.getTrimmedLength((CharSequence)localObject1);
      if (i > 0)
      {
        Object localObject2 = this.o00o00o;
        String str;
        boolean bool;
        if (localObject2 != null)
        {
          str = ((CharSequence)localObject1).toString();
          bool = ((SearchView.OnQueryTextListener)localObject2).OooO0O0(str);
          if (bool) {}
        }
        else
        {
          localObject2 = this.o00o0o;
          str = null;
          if (localObject2 != null)
          {
            bool = false;
            localObject2 = null;
            localObject1 = ((CharSequence)localObject1).toString();
            OooOOoo(0, null, (String)localObject1);
          }
          localObject1 = this.o00OoOoo;
          ((SearchView.SearchAutoComplete)localObject1).setImeVisibility(false);
          OooOO0o();
        }
      }
    }
  }
  
  public void OooOoO0()
  {
    Oooo0oO(false);
    this.o00OoOoo.requestFocus();
    Object localObject = this.o00OoOoo;
    boolean bool = true;
    ((SearchView.SearchAutoComplete)localObject).setImeVisibility(bool);
    localObject = this.o00o0O00;
    if (localObject != null) {
      ((View.OnClickListener)localObject).onClick(this);
    }
  }
  
  public boolean OooOoOO(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    paramView = this.o00o0o;
    if (paramView == null) {
      return false;
    }
    paramView = this.o00o0OO0;
    if (paramView == null) {
      return false;
    }
    int i = paramKeyEvent.getAction();
    if (i == 0)
    {
      boolean bool = paramKeyEvent.hasNoModifiers();
      if (bool)
      {
        int j = 66;
        if (paramInt != j)
        {
          j = 84;
          if (paramInt != j)
          {
            j = 61;
            if (paramInt != j)
            {
              j = 21;
              if (paramInt != j)
              {
                int k = 22;
                if (paramInt != k)
                {
                  j = 19;
                  if (paramInt != j) {
                    break label196;
                  }
                  this.o00OoOoo.getListSelection();
                  return false;
                }
              }
              if (paramInt == j)
              {
                j = 0;
                paramView = null;
              }
              else
              {
                paramView = this.o00OoOoo;
                j = paramView.length();
              }
              this.o00OoOoo.setSelection(j);
              this.o00OoOoo.setListSelection(0);
              this.o00OoOoo.clearListSelection();
              this.o00OoOoo.OooO00o();
              return true;
            }
          }
        }
        j = this.o00OoOoo.getListSelection();
        return OooOo0O(j, 0, null);
      }
    }
    label196:
    return false;
  }
  
  public void OooOoo()
  {
    boolean bool = isIconified();
    Oooo0oO(bool);
    OooOooo();
    SearchView.SearchAutoComplete localSearchAutoComplete = this.o00OoOoo;
    bool = localSearchAutoComplete.hasFocus();
    if (bool) {
      OooOOO0();
    }
  }
  
  public void OooOoo0(CharSequence paramCharSequence)
  {
    Object localObject = this.o00OoOoo.getText();
    this.o00o0o00 = ((CharSequence)localObject);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject) ^ true;
    Oooo0o(bool);
    bool ^= true;
    Oooo0oo(bool);
    Oooo00o();
    Oooo0o0();
    localObject = this.o00o00o;
    if (localObject != null)
    {
      localObject = this.o00o0Ooo;
      bool = TextUtils.equals(paramCharSequence, (CharSequence)localObject);
      if (!bool)
      {
        localObject = this.o00o00o;
        String str = paramCharSequence.toString();
        ((SearchView.OnQueryTextListener)localObject).OooO00o(str);
      }
    }
    paramCharSequence = paramCharSequence.toString();
    this.o00o0Ooo = paramCharSequence;
  }
  
  public void OooOooO()
  {
    Object localObject1 = this.o00o0o;
    if (localObject1 == null) {
      return;
    }
    try
    {
      boolean bool = ((SearchableInfo)localObject1).getVoiceSearchLaunchWebSearch();
      Object localObject2;
      if (bool) {
        localObject2 = this.o00o00O0;
      }
      for (localObject1 = OooOO0O((Intent)localObject2, (SearchableInfo)localObject1);; localObject1 = OooOO0((Intent)localObject2, (SearchableInfo)localObject1))
      {
        localObject2 = getContext();
        ((Context)localObject2).startActivity((Intent)localObject1);
        break;
        bool = ((SearchableInfo)localObject1).getVoiceSearchLaunchRecognizer();
        if (!bool) {
          break;
        }
        localObject2 = this.o00o00Oo;
      }
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException) {}
  }
  
  public final void OooOooo()
  {
    Runnable localRunnable = this.o00o0oO;
    post(localRunnable);
  }
  
  public void Oooo0()
  {
    Object localObject = this.o00OoOoo;
    boolean bool = ((View)localObject).hasFocus();
    if (bool) {
      localObject = ViewGroup.FOCUSED_STATE_SET;
    } else {
      localObject = ViewGroup.EMPTY_STATE_SET;
    }
    Drawable localDrawable = this.o00Ooo0.getBackground();
    if (localDrawable != null) {
      localDrawable.setState((int[])localObject);
    }
    localDrawable = this.o00Ooo0O.getBackground();
    if (localDrawable != null) {
      localDrawable.setState((int[])localObject);
    }
    invalidate();
  }
  
  public final void Oooo000(int paramInt)
  {
    Editable localEditable = this.o00OoOoo.getText();
    Cursor localCursor = this.o00o0OO0.getCursor();
    if (localCursor == null) {
      return;
    }
    paramInt = localCursor.moveToPosition(paramInt);
    if (paramInt != 0)
    {
      CharSequence localCharSequence = this.o00o0OO0.OooO00o(localCursor);
      if (localCharSequence != null)
      {
        setQuery(localCharSequence);
        return;
      }
    }
    setQuery(localEditable);
  }
  
  public void Oooo00O(CharSequence paramCharSequence, boolean paramBoolean)
  {
    SearchView.SearchAutoComplete localSearchAutoComplete = this.o00OoOoo;
    localSearchAutoComplete.setText(paramCharSequence);
    if (paramCharSequence != null)
    {
      localSearchAutoComplete = this.o00OoOoo;
      int i = localSearchAutoComplete.length();
      localSearchAutoComplete.setSelection(i);
      this.o00o0o00 = paramCharSequence;
    }
    if (paramBoolean)
    {
      boolean bool = TextUtils.isEmpty(paramCharSequence);
      if (!bool) {
        OooOoO();
      }
    }
  }
  
  public final void Oooo00o()
  {
    Object localObject = this.o00OoOoo.getText();
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject);
    boolean bool2 = true;
    bool1 ^= bool2;
    int i = 0;
    if (!bool1)
    {
      boolean bool3 = this.o00o0O0;
      if (bool3)
      {
        bool3 = this.o00o0o0O;
        if (!bool3) {}
      }
      else
      {
        bool2 = false;
        localDrawable = null;
      }
    }
    ImageView localImageView = this.o00OooO;
    if (!bool2) {
      i = 8;
    }
    localImageView.setVisibility(i);
    Drawable localDrawable = this.o00OooO.getDrawable();
    if (localDrawable != null)
    {
      if (bool1) {
        localObject = ViewGroup.ENABLED_STATE_SET;
      } else {
        localObject = ViewGroup.EMPTY_STATE_SET;
      }
      localDrawable.setState((int[])localObject);
    }
  }
  
  public final void Oooo0O0()
  {
    Object localObject = getQueryHint();
    SearchView.SearchAutoComplete localSearchAutoComplete = this.o00OoOoo;
    if (localObject == null) {
      localObject = "";
    }
    localObject = OooOOOO((CharSequence)localObject);
    localSearchAutoComplete.setHint((CharSequence)localObject);
  }
  
  public final void Oooo0OO()
  {
    Object localObject1 = this.o00OoOoo;
    int i = this.o00o0o.getSuggestThreshold();
    ((SearchView.SearchAutoComplete)localObject1).setThreshold(i);
    localObject1 = this.o00OoOoo;
    Object localObject2 = this.o00o0o;
    i = ((SearchableInfo)localObject2).getImeOptions();
    ((TextView)localObject1).setImeOptions(i);
    localObject1 = this.o00o0o;
    int j = ((SearchableInfo)localObject1).getInputType();
    i = j & 0xF;
    int k = 1;
    if (i == k)
    {
      i = -65537;
      j &= i;
      localObject2 = this.o00o0o.getSuggestAuthority();
      if (localObject2 != null)
      {
        j |= 0x10000;
        i = 524288;
        j |= i;
      }
    }
    localObject2 = this.o00OoOoo;
    ((TextView)localObject2).setInputType(j);
    localObject1 = this.o00o0OO0;
    if (localObject1 != null)
    {
      i = 0;
      localObject2 = null;
      ((CursorAdapter)localObject1).OooO0O0(null);
    }
    localObject1 = this.o00o0o.getSuggestAuthority();
    if (localObject1 != null)
    {
      localObject1 = new androidx/appcompat/widget/SuggestionsAdapter;
      localObject2 = getContext();
      SearchableInfo localSearchableInfo = this.o00o0o;
      WeakHashMap localWeakHashMap = this.o00o0oOo;
      ((SuggestionsAdapter)localObject1).<init>((Context)localObject2, this, localSearchableInfo, localWeakHashMap);
      this.o00o0OO0 = ((CursorAdapter)localObject1);
      localObject2 = this.o00OoOoo;
      ((AutoCompleteTextView)localObject2).setAdapter((ListAdapter)localObject1);
      localObject1 = (SuggestionsAdapter)this.o00o0OO0;
      boolean bool = this.o00o0OOo;
      if (bool) {
        k = 2;
      }
      ((SuggestionsAdapter)localObject1).setQueryRefinement(k);
    }
  }
  
  public final void Oooo0o(boolean paramBoolean)
  {
    boolean bool = this.o00o0OO;
    if (bool)
    {
      bool = isSubmitAreaEnabled();
      if (bool)
      {
        bool = hasFocus();
        if (bool) {
          if (!paramBoolean)
          {
            paramBoolean = this.o00o0OoO;
            if (paramBoolean) {}
          }
          else
          {
            paramBoolean = false;
            break label48;
          }
        }
      }
    }
    paramBoolean = true;
    label48:
    this.o00OooO0.setVisibility(paramBoolean);
  }
  
  public final void Oooo0o0()
  {
    boolean bool = isSubmitAreaEnabled();
    if (bool)
    {
      ImageView localImageView = this.o00OooO0;
      i = localImageView.getVisibility();
      if (i != 0)
      {
        localImageView = this.o00OooOO;
        i = localImageView.getVisibility();
        if (i != 0) {}
      }
      else
      {
        i = 0;
        localImageView = null;
        break label47;
      }
    }
    int i = 8;
    label47:
    this.o00Ooo0O.setVisibility(i);
  }
  
  public final void Oooo0oO(boolean paramBoolean)
  {
    this.o00o0O0O = paramBoolean;
    int i = 0;
    boolean bool1 = true;
    int j;
    if (paramBoolean)
    {
      j = 0;
      localView = null;
    }
    else
    {
      j = bool1;
    }
    Editable localEditable = this.o00OoOoo.getText();
    boolean bool2 = TextUtils.isEmpty(localEditable) ^ true;
    ImageView localImageView = this.o00Ooo0o;
    localImageView.setVisibility(j);
    Oooo0o(bool2);
    View localView = this.o00Ooo00;
    if (paramBoolean)
    {
      paramBoolean = bool1;
    }
    else
    {
      paramBoolean = false;
      localDrawable = null;
    }
    localView.setVisibility(paramBoolean);
    Drawable localDrawable = this.o00o000O.getDrawable();
    if (localDrawable != null)
    {
      paramBoolean = this.o00o0O0;
      if (!paramBoolean) {}
    }
    else
    {
      i = bool1;
    }
    this.o00o000O.setVisibility(i);
    Oooo00o();
    paramBoolean = bool2 ^ true;
    Oooo0oo(paramBoolean);
    Oooo0o0();
  }
  
  public final void Oooo0oo(boolean paramBoolean)
  {
    boolean bool = this.o00o0OoO;
    int i = 8;
    if (bool)
    {
      bool = isIconified();
      if ((!bool) && (paramBoolean))
      {
        ImageView localImageView = this.o00OooO0;
        localImageView.setVisibility(i);
        i = 0;
      }
    }
    this.o00OooOO.setVisibility(i);
  }
  
  public void clearFocus()
  {
    this.o00o0Oo0 = true;
    super.clearFocus();
    this.o00OoOoo.clearFocus();
    this.o00OoOoo.setImeVisibility(false);
    this.o00o0Oo0 = false;
  }
  
  public int getImeOptions()
  {
    return this.o00OoOoo.getImeOptions();
  }
  
  public int getInputType()
  {
    return this.o00OoOoo.getInputType();
  }
  
  public int getMaxWidth()
  {
    return this.o00o0Oo;
  }
  
  public CharSequence getQuery()
  {
    return this.o00OoOoo.getText();
  }
  
  public CharSequence getQueryHint()
  {
    Object localObject = this.o00o0OOO;
    if (localObject == null)
    {
      localObject = this.o00o0o;
      if (localObject != null)
      {
        int i = ((SearchableInfo)localObject).getHintId();
        if (i != 0)
        {
          localObject = getContext();
          SearchableInfo localSearchableInfo = this.o00o0o;
          int j = localSearchableInfo.getHintId();
          return ((Context)localObject).getText(j);
        }
      }
      localObject = this.o00o00o0;
    }
    return localObject;
  }
  
  public int getSuggestionCommitIconResId()
  {
    return this.o00o00;
  }
  
  public int getSuggestionRowLayout()
  {
    return this.oo00oO;
  }
  
  public CursorAdapter getSuggestionsAdapter()
  {
    return this.o00o0OO0;
  }
  
  public boolean isIconfiedByDefault()
  {
    return this.o00o0O0;
  }
  
  public boolean isIconified()
  {
    return this.o00o0O0O;
  }
  
  public boolean isQueryRefinementEnabled()
  {
    return this.o00o0OOo;
  }
  
  public boolean isSubmitButtonEnabled()
  {
    return this.o00o0OO;
  }
  
  public void onDetachedFromWindow()
  {
    Runnable localRunnable = this.o00o0oO;
    removeCallbacks(localRunnable);
    localRunnable = this.o00o0oOO;
    post(localRunnable);
    super.onDetachedFromWindow();
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
    {
      Object localObject = this.o00OoOoo;
      Rect localRect1 = this.o00OoooO;
      OooOOO((View)localObject, localRect1);
      localObject = this.o00Ooooo;
      localRect1 = this.o00OoooO;
      paramInt3 = localRect1.left;
      paramInt1 = localRect1.right;
      paramInt4 -= paramInt2;
      paramInt2 = 0;
      Rect localRect2 = null;
      ((Rect)localObject).set(paramInt3, 0, paramInt1, paramInt4);
      localObject = this.o0O00o0;
      if (localObject == null)
      {
        localObject = new androidx/appcompat/widget/SearchView$UpdatableTouchDelegate;
        localRect1 = this.o00Ooooo;
        localRect2 = this.o00OoooO;
        SearchView.SearchAutoComplete localSearchAutoComplete = this.o00OoOoo;
        ((SearchView.UpdatableTouchDelegate)localObject).<init>(localRect1, localRect2, localSearchAutoComplete);
        this.o0O00o0 = ((SearchView.UpdatableTouchDelegate)localObject);
        setTouchDelegate((TouchDelegate)localObject);
      }
      else
      {
        localRect1 = this.o00Ooooo;
        localRect2 = this.o00OoooO;
        ((SearchView.UpdatableTouchDelegate)localObject).OooO00o(localRect1, localRect2);
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = isIconified();
    if (bool)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int j = -1 << -1;
    int k = 1073741824;
    if (i != j)
    {
      if (i != 0)
      {
        if (i != k) {
          break label110;
        }
        i = this.o00o0Oo;
        if (i <= 0) {
          break label110;
        }
      }
      else
      {
        paramInt1 = this.o00o0Oo;
        if (paramInt1 > 0) {
          break label110;
        }
        paramInt1 = getPreferredWidth();
        break label110;
      }
    }
    else
    {
      i = this.o00o0Oo;
      if (i > 0) {
        break label104;
      }
    }
    i = getPreferredWidth();
    label104:
    paramInt1 = Math.min(i, paramInt1);
    label110:
    i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (i != j)
    {
      if (i == 0) {
        paramInt2 = getPreferredHeight();
      }
    }
    else
    {
      i = getPreferredHeight();
      paramInt2 = Math.min(i, paramInt2);
    }
    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, k);
    paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt2, k);
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool1 = paramParcelable instanceof SearchView.SavedState;
    if (!bool1)
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SearchView.SavedState)paramParcelable;
    Parcelable localParcelable = paramParcelable.getSuperState();
    super.onRestoreInstanceState(localParcelable);
    boolean bool2 = paramParcelable.o00OoOoo;
    Oooo0oO(bool2);
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    SearchView.SavedState localSavedState = new androidx/appcompat/widget/SearchView$SavedState;
    localSavedState.<init>(localParcelable);
    boolean bool = isIconified();
    localSavedState.o00OoOoo = bool;
    return localSavedState;
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    OooOooo();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    boolean bool = this.o00o0Oo0;
    if (bool) {
      return false;
    }
    bool = isFocusable();
    if (!bool) {
      return false;
    }
    bool = isIconified();
    if (!bool)
    {
      SearchView.SearchAutoComplete localSearchAutoComplete = this.o00OoOoo;
      paramInt = localSearchAutoComplete.requestFocus(paramInt, paramRect);
      if (paramInt != 0) {
        Oooo0oO(false);
      }
      return paramInt;
    }
    return super.requestFocus(paramInt, paramRect);
  }
  
  public void setAppSearchData(Bundle paramBundle)
  {
    this.o00o0oO0 = paramBundle;
  }
  
  public void setIconified(boolean paramBoolean)
  {
    if (paramBoolean) {
      OooOo0();
    } else {
      OooOoO0();
    }
  }
  
  public void setIconifiedByDefault(boolean paramBoolean)
  {
    boolean bool = this.o00o0O0;
    if (bool == paramBoolean) {
      return;
    }
    this.o00o0O0 = paramBoolean;
    Oooo0oO(paramBoolean);
    Oooo0O0();
  }
  
  public void setImeOptions(int paramInt)
  {
    this.o00OoOoo.setImeOptions(paramInt);
  }
  
  public void setInputType(int paramInt)
  {
    this.o00OoOoo.setInputType(paramInt);
  }
  
  public void setMaxWidth(int paramInt)
  {
    this.o00o0Oo = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(SearchView.OnCloseListener paramOnCloseListener)
  {
    this.o00o00oO = paramOnCloseListener;
  }
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.o00o00oo = paramOnFocusChangeListener;
  }
  
  public void setOnQueryTextListener(SearchView.OnQueryTextListener paramOnQueryTextListener)
  {
    this.o00o00o = paramOnQueryTextListener;
  }
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    this.o00o0O00 = paramOnClickListener;
  }
  
  public void setOnSuggestionListener(SearchView.OnSuggestionListener paramOnSuggestionListener)
  {
    this.o00o0 = paramOnSuggestionListener;
  }
  
  public void setQueryHint(CharSequence paramCharSequence)
  {
    this.o00o0OOO = paramCharSequence;
    Oooo0O0();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean)
  {
    this.o00o0OOo = paramBoolean;
    Object localObject = this.o00o0OO0;
    boolean bool = localObject instanceof SuggestionsAdapter;
    if (bool)
    {
      localObject = (SuggestionsAdapter)localObject;
      if (paramBoolean) {
        paramBoolean = true;
      } else {
        paramBoolean = true;
      }
      ((SuggestionsAdapter)localObject).setQueryRefinement(paramBoolean);
    }
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo)
  {
    this.o00o0o = paramSearchableInfo;
    if (paramSearchableInfo != null)
    {
      Oooo0OO();
      Oooo0O0();
    }
    boolean bool = OooOOOo();
    this.o00o0OoO = bool;
    if (bool)
    {
      paramSearchableInfo = this.o00OoOoo;
      String str = "nm";
      paramSearchableInfo.setPrivateImeOptions(str);
    }
    bool = isIconified();
    Oooo0oO(bool);
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean)
  {
    this.o00o0OO = paramBoolean;
    paramBoolean = isIconified();
    Oooo0oO(paramBoolean);
  }
  
  public void setSuggestionsAdapter(CursorAdapter paramCursorAdapter)
  {
    this.o00o0OO0 = paramCursorAdapter;
    this.o00OoOoo.setAdapter(paramCursorAdapter);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.SearchView
 * JD-Core Version:    0.7.0.1
 */