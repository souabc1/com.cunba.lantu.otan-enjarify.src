package com.simplemobiletools.commons.extensions;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import m54207b69;

public final class Context_storageKt
{
  public static final List OooO00o;
  public static final ArrayList OooO0O0 = CollectionsKt.OooO0o(tmp270_259);
  
  static
  {
    String str1 = m54207b69.F54207b69_11("~21D745E594462615D255F5D515F2A");
    String str2 = m54207b69.F54207b69_11("\\R7D143E392442413D85463A3B89");
    OooO00o = CollectionsKt.OooOO0O(new String[] { str1, str2 });
    str2 = m54207b69.F54207b69_11("021D42486044585B5E254A605C5F4D6412");
    String str3 = m54207b69.F54207b69_11("rT7B28223E2A3A3938833A362B333D45443641");
    String str4 = m54207b69.F54207b69_11("H>114E4C5450645F62195664686B59681D216C585D6F6166766A7A6775797C6A79");
    String str5 = m54207b69.F54207b69_11(",g480B0B164C07251A1C0C0E112110");
    String str6 = m54207b69.F54207b69_11("_`4F0E101753180A0A091B0E5A11252214221F131F53281A");
    String str7 = m54207b69.F54207b69_11("k\\7332342B773E2A2F41373C483C103D47");
    String str8 = m54207b69.F54207b69_11("~21D605E4921645D5D635C774B512A4F656164526917");
    String str9 = m54207b69.F54207b69_11("%U7A28323B3E283A3E41398443484335493642");
    String str10 = m54207b69.F54207b69_11("U,0342445B074E474857");
    String str11 = m54207b69.F54207b69_11("dH673C3E2A3E2E35346F363A473947343834282D1F");
    String str12 = m54207b69.F54207b69_11("E.015E5C4460544F52095460657D6A58");
    String str13 = m54207b69.F54207b69_11("ND6B38322E3A2A2928733F2B34373F333538327D4A343C3B4D388E");
    String str14 = m54207b69.F54207b69_11("g8175D5B4F5D1C5163654956");
    String str15 = m54207b69.F54207b69_11("56195359455B1E4B595B574C0F");
    String str16 = m54207b69.F54207b69_11("x_703C402E4275324242303577");
    String str17 = m54207b69.F54207b69_11("EQ7E3632283483283C3C322F70");
    String str18 = m54207b69.F54207b69_11("*21D42585457455C0A");
    String str19 = m54207b69.F54207b69_11("yv590614181B09184B");
    String str20 = m54207b69.F54207b69_11("7[742931372D3F42457C3732444B3F363F7B");
    String str21 = m54207b69.F54207b69_11("c[742931372D3F42457C3732444B3F363F7A");
    String str22 = m54207b69.F54207b69_11("tm421F1B052311100F4A21281A15112C156F");
    String[] tmp179_176 = new String[21];
    String[] tmp180_179 = tmp179_176;
    String[] tmp180_179 = tmp179_176;
    tmp180_179[0] = str2;
    tmp180_179[1] = str3;
    String[] tmp187_180 = tmp180_179;
    String[] tmp187_180 = tmp180_179;
    tmp187_180[2] = str4;
    tmp187_180[3] = str5;
    String[] tmp195_187 = tmp187_180;
    String[] tmp195_187 = tmp187_180;
    tmp195_187[4] = str6;
    tmp195_187[5] = str7;
    String[] tmp204_195 = tmp195_187;
    String[] tmp204_195 = tmp195_187;
    tmp204_195[6] = str8;
    tmp204_195[7] = str9;
    String[] tmp215_204 = tmp204_195;
    String[] tmp215_204 = tmp204_195;
    tmp215_204[8] = str10;
    tmp215_204[9] = str11;
    String[] tmp226_215 = tmp215_204;
    String[] tmp226_215 = tmp215_204;
    tmp226_215[10] = str12;
    tmp226_215[11] = str13;
    String[] tmp237_226 = tmp226_215;
    String[] tmp237_226 = tmp226_215;
    tmp237_226[12] = str14;
    tmp237_226[13] = str15;
    String[] tmp248_237 = tmp237_226;
    String[] tmp248_237 = tmp237_226;
    tmp248_237[14] = str16;
    tmp248_237[15] = str17;
    String[] tmp259_248 = tmp248_237;
    String[] tmp259_248 = tmp248_237;
    tmp259_248[16] = str18;
    tmp259_248[17] = str19;
    String[] tmp270_259 = tmp259_248;
    String[] tmp270_259 = tmp259_248;
    tmp270_259[18] = str20;
    tmp270_259[19] = str21;
    tmp270_259[20] = str22;
  }
  
  public static final String OooO00o(Context paramContext)
  {
    Object localObject = m54207b69.F54207b69_11("q00C455A5C4713");
    Intrinsics.OooO0o(paramContext, (String)localObject);
    paramContext = new java/io/File;
    localObject = m54207b69.F54207b69_11("lZ752A30382C4043467D48413A42483C4E4E867C");
    paramContext.<init>((String)localObject);
    boolean bool = paramContext.exists();
    if (!bool)
    {
      paramContext = Environment.getExternalStorageDirectory().getAbsolutePath();
      localObject = m54207b69.F54207b69_11("@U323123133126362E433D43112D4735434241234F3B454C385240469898985256465B5B4345552B5B4966");
      Intrinsics.OooO0o0(paramContext, (String)localObject);
      int i = 1;
      localObject = new char[i];
      int j = 47;
      localObject[0] = j;
      localObject = StringsKt.OoooooO(paramContext, (char[])localObject);
    }
    return localObject;
  }
  
  public static final String OooO0O0(Context paramContext)
  {
    Object localObject1 = m54207b69.F54207b69_11("q00C455A5C4713");
    Intrinsics.OooO0o(paramContext, (String)localObject1);
    localObject1 = OooO0OO(paramContext);
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    int i = localObject1.length;
    int j = 0;
    Object localObject3 = null;
    int k;
    Object localObject4;
    Object localObject5;
    for (;;)
    {
      k = 1;
      if (j >= i) {
        break;
      }
      localObject4 = localObject1[j];
      localObject5 = OooO00o(paramContext);
      boolean bool2 = ((String)localObject4).equals(localObject5);
      if (!bool2)
      {
        localObject5 = m54207b69.F54207b69_11("lZ752A30382C4043467D48413A42483C4E4E867C");
        bool2 = StringsKt.OooOO0((String)localObject4, (String)localObject5, k);
        if (!bool2) {}
      }
      else
      {
        k = 0;
      }
      if (k != 0) {
        ((Collection)localObject2).add(localObject4);
      }
      j += 1;
    }
    String str1 = ".56B1B48445E4C5A595823787F247C62275F162A1F7C63175F30878E338B71366E25392E8B72266E38";
    paramContext = Pattern.compile(m54207b69.F54207b69_11(str1));
    localObject1 = ((Iterable)localObject2).iterator();
    int m;
    do
    {
      bool1 = ((Iterator)localObject1).hasNext();
      j = 0;
      localObject3 = null;
      if (!bool1) {
        break;
      }
      localObject6 = ((Iterator)localObject1).next();
      localObject4 = localObject6;
      localObject4 = (String)localObject6;
      localObject4 = paramContext.matcher((CharSequence)localObject4);
      m = ((Matcher)localObject4).matches();
    } while (m == 0);
    break label204;
    boolean bool1 = false;
    Object localObject6 = null;
    label204:
    localObject6 = (String)localObject6;
    paramContext = "";
    Object localObject7;
    if (localObject6 == null)
    {
      localObject1 = ((Iterable)localObject2).iterator();
      do
      {
        bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        localObject6 = ((Iterator)localObject1).next();
        localObject4 = localObject6;
        localObject4 = (String)localObject6;
        localObject5 = OooO0O0;
        localObject4 = ((String)localObject4).toLowerCase();
        localObject7 = m54207b69.F54207b69_11(";~0A171910622413651C28122A5C1F2D1F29613F1D202C26306F69242C4E2E273A2C5E41303F7B7D");
        Intrinsics.OooO0o0(localObject4, (String)localObject7);
        m = ((ArrayList)localObject5).contains(localObject4) ^ k;
      } while (m == 0);
      localObject3 = localObject6;
      localObject6 = localObject3;
      localObject6 = (String)localObject3;
      if (localObject6 == null) {
        localObject6 = paramContext;
      }
    }
    localObject1 = new char[k];
    j = 47;
    localObject1[0] = j;
    localObject1 = StringsKt.OoooooO((String)localObject6, (char[])localObject1);
    int i1 = ((CharSequence)localObject1).length();
    if (i1 == 0)
    {
      i1 = k;
    }
    else
    {
      i1 = 0;
      localObject1 = null;
    }
    if (i1 != 0)
    {
      localObject1 = new java/io/File;
      localObject6 = m54207b69.F54207b69_11("021D42486044585B5E254A605C5F4D6412");
      ((File)localObject1).<init>((String)localObject6);
      bool1 = ((File)localObject1).exists();
      if (bool1)
      {
        paramContext = ((File)localObject1).getAbsolutePath();
        localObject1 = m54207b69.F54207b69_11("Ye030D0B034F090D1D12121A1C0C4212201D");
        Intrinsics.OooO0o0(paramContext, (String)localObject1);
        return paramContext;
      }
      localObject1 = (String)CollectionsKt.Oooo0oO((List)localObject2);
      if (localObject1 != null) {
        paramContext = (Context)localObject1;
      }
      localObject6 = paramContext;
    }
    int i2 = ((CharSequence)localObject6).length();
    if (i2 == 0)
    {
      i2 = k;
    }
    else
    {
      i2 = 0;
      paramContext = null;
    }
    if (i2 != 0)
    {
      str1 = "ro313530453913481C674B603D20682051443F544822572B765A6F4C2F772F69";
      paramContext = Pattern.compile(m54207b69.F54207b69_11(str1));
      try
      {
        localObject1 = new java/io/File;
        localObject2 = "eB6D32383034282B2E";
        localObject2 = m54207b69.F54207b69_11((String)localObject2);
        ((File)localObject1).<init>((String)localObject2);
        localObject1 = ((File)localObject1).listFiles();
        if (localObject1 != null)
        {
          int i3 = localObject1.length;
          m = 0;
          localObject4 = null;
          while (m < i3)
          {
            localObject5 = localObject1[m];
            localObject7 = ((File)localObject5).getName();
            localObject7 = paramContext.matcher((CharSequence)localObject7);
            boolean bool3 = ((Matcher)localObject7).matches();
            if (bool3)
            {
              localObject7 = new java/lang/StringBuilder;
              ((StringBuilder)localObject7).<init>();
              String str2 = "<D6B38322E3A2A292873";
              str2 = m54207b69.F54207b69_11(str2);
              ((StringBuilder)localObject7).append(str2);
              localObject5 = ((File)localObject5).getName();
              ((StringBuilder)localObject7).append((String)localObject5);
              localObject6 = ((StringBuilder)localObject7).toString();
            }
            int n;
            m += 1;
          }
        }
        paramContext = new char[k];
      }
      catch (Exception localException) {}
    }
    paramContext[0] = j;
    return StringsKt.OoooooO((String)localObject6, paramContext);
  }
  
  public static final String[] OooO0OO(Context paramContext)
  {
    Object localObject1 = m54207b69.F54207b69_11("q00C455A5C4713");
    Intrinsics.OooO0o(paramContext, (String)localObject1);
    localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    System.getenv(m54207b69.F54207b69_11("<o2A383D2D4126342A3845452B493B3639"));
    Object localObject2 = System.getenv(m54207b69.F54207b69_11("7I1A0D0C090B120E22181F24281228161D1C"));
    Object localObject3 = System.getenv(m54207b69.F54207b69_11("sY1C150E181C1222240E13172117252C2B161E2A1E323123"));
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject3);
    int m = 10;
    int n = 1;
    boolean bool4;
    if (bool1)
    {
      bool4 = false;
      paramContext = paramContext.getExternalFilesDirs(null);
      localObject3 = m54207b69.F54207b69_11("Be020113232116061E130D132E18160E25311D2929612026202165");
      Intrinsics.OooO0o0(paramContext, (String)localObject3);
      paramContext = ArraysKt.OooOoOO(paramContext);
      localObject3 = new java/util/ArrayList;
      int i = CollectionsKt.OooOOo0(paramContext, m);
      ((ArrayList)localObject3).<init>(i);
      paramContext = paramContext.iterator();
      for (;;)
      {
        boolean bool2 = paramContext.hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = ((File)paramContext.next()).getAbsolutePath();
        ((Collection)localObject3).add(localObject4);
      }
      paramContext = ((Iterable)localObject3).iterator();
      for (;;)
      {
        bool4 = paramContext.hasNext();
        if (!bool4) {
          break;
        }
        localObject3 = (String)paramContext.next();
        Intrinsics.OooO0o0(localObject3, "it");
        String str = m54207b69.F54207b69_11("O4755B52495F625622585E4A60");
        int i2 = 6;
        j = StringsKt.OooOooo((CharSequence)localObject3, str, 0, false, i2, null);
        localObject3 = ((String)localObject3).substring(0, j);
        localObject4 = "this as java.lang.String…ing(startIndex, endIndex)";
        Intrinsics.OooO0o0(localObject3, (String)localObject4);
        ((Collection)localObject1).add(localObject3);
      }
    }
    paramContext = Environment.getExternalStorageDirectory().getAbsolutePath();
    Object localObject4 = Pattern.compile("/");
    paramContext = ((Pattern)localObject4).split(paramContext);
    int j = paramContext.length - n;
    paramContext = paramContext[j];
    try
    {
      Integer.valueOf(paramContext);
      j = n;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      j = 0;
      localObject4 = null;
    }
    if (j == 0) {
      paramContext = "";
    }
    boolean bool3 = TextUtils.isEmpty(paramContext);
    if (bool3)
    {
      Intrinsics.OooO0OO(localObject3);
      ((HashSet)localObject1).add(localObject3);
    }
    else
    {
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      ((StringBuilder)localObject4).append((String)localObject3);
      localObject3 = File.separator;
      ((StringBuilder)localObject4).append((String)localObject3);
      ((StringBuilder)localObject4).append(paramContext);
      paramContext = ((StringBuilder)localObject4).toString();
      ((HashSet)localObject1).add(paramContext);
    }
    boolean bool5 = TextUtils.isEmpty((CharSequence)localObject2);
    if (!bool5)
    {
      Intrinsics.OooO0OO(localObject2);
      paramContext = File.pathSeparator;
      localObject3 = m54207b69.F54207b69_11("rh180A1E033F121E102212261226");
      Intrinsics.OooO0o0(paramContext, (String)localObject3);
      localObject3 = new kotlin/text/Regex;
      ((Regex)localObject3).<init>(paramContext);
      paramContext = ((Regex)localObject3).OooO0OO((CharSequence)localObject2, 0);
      boolean bool6 = paramContext.isEmpty();
      if (!bool6)
      {
        i3 = paramContext.size();
        localObject2 = paramContext.listIterator(i3);
        int i1;
        do
        {
          bool4 = ((ListIterator)localObject2).hasPrevious();
          if (!bool4) {
            break;
          }
          localObject3 = (String)((ListIterator)localObject2).previous();
          i1 = ((CharSequence)localObject3).length();
          if (i1 == 0)
          {
            i1 = n;
          }
          else
          {
            i1 = 0;
            localObject3 = null;
          }
        } while (i1 != 0);
        i3 = ((ListIterator)localObject2).nextIndex() + n;
        paramContext = CollectionsKt.OooooOo(paramContext, i3);
      }
      else
      {
        paramContext = CollectionsKt.OooO0oo();
      }
      localObject2 = new String[0];
      paramContext = (String[])paramContext.toArray((Object[])localObject2);
      i3 = paramContext.length;
      paramContext = Arrays.copyOf(paramContext, i3);
      Collections.addAll((Collection)localObject1, paramContext);
    }
    paramContext = new java/util/ArrayList;
    int i3 = CollectionsKt.OooOOo0((Iterable)localObject1, m);
    paramContext.<init>(i3);
    localObject1 = ((Iterable)localObject1).iterator();
    for (;;)
    {
      boolean bool7 = ((Iterator)localObject1).hasNext();
      if (!bool7) {
        break;
      }
      localObject2 = (String)((Iterator)localObject1).next();
      localObject3 = new char[n];
      int k = 47;
      localObject3[0] = k;
      localObject2 = StringsKt.OoooooO((String)localObject2, (char[])localObject3);
      paramContext.add(localObject2);
    }
    localObject1 = new String[0];
    return (String[])paramContext.toArray((Object[])localObject1);
  }
  
  public static final List getDIRS_ACCESSIBLE_ONLY_WITH_SAF()
  {
    return OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.simplemobiletools.commons.extensions.Context_storageKt
 * JD-Core Version:    0.7.0.1
 */