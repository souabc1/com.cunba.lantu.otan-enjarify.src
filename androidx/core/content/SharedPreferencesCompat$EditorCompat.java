package androidx.core.content;

public final class SharedPreferencesCompat$EditorCompat
{
  public static EditorCompat OooO0O0;
  public final SharedPreferencesCompat.EditorCompat.Helper OooO00o;
  
  private SharedPreferencesCompat$EditorCompat()
  {
    SharedPreferencesCompat.EditorCompat.Helper localHelper = new androidx/core/content/SharedPreferencesCompat$EditorCompat$Helper;
    localHelper.<init>();
    this.OooO00o = localHelper;
  }
  
  public static EditorCompat getInstance()
  {
    EditorCompat localEditorCompat = OooO0O0;
    if (localEditorCompat == null)
    {
      localEditorCompat = new androidx/core/content/SharedPreferencesCompat$EditorCompat;
      localEditorCompat.<init>();
      OooO0O0 = localEditorCompat;
    }
    return OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.SharedPreferencesCompat.EditorCompat
 * JD-Core Version:    0.7.0.1
 */