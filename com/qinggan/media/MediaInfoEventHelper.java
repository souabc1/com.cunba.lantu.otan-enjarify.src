package com.qinggan.media;

import android.os.BaseBundle;
import android.text.TextUtils;
import com.qinggan.bus.QGBus;
import com.qinggan.bus.QGBusEvent;
import com.qinggan.bus.QGBusEventFilter;
import com.qinggan.bus.QGBusEventHandler;
import com.qinggan.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import m54207b69;

public class MediaInfoEventHelper
{
  public static boolean OooO0oo = false;
  public int OooO00o;
  public String OooO0O0;
  public HashMap OooO0OO;
  public List OooO0Oo;
  public QGBus OooO0o;
  public QGBusEvent OooO0o0;
  public QGBusEventHandler OooO0oO;
  
  public final void OooOO0o(QGBusEvent paramQGBusEvent)
  {
    if (paramQGBusEvent != null)
    {
      Object localObject = paramQGBusEvent.o00Ooo0;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool)
      {
        localObject = this.OooO0OO;
        String str = paramQGBusEvent.o00Ooo0;
        ((HashMap)localObject).put(str, paramQGBusEvent);
      }
    }
  }
  
  public final boolean OooOOO(QGBusEvent paramQGBusEvent)
  {
    String str1 = paramQGBusEvent.getEventType();
    String str2 = m54207b69.F54207b69_11("gS1E37393D36811B190D23272028");
    boolean bool = str2.equals(str1);
    if (!bool) {
      return false;
    }
    return OooOOOo(paramQGBusEvent);
  }
  
  public final void OooOOO0(MediaInfoEventHelper.MediaInfoEventHandler paramMediaInfoEventHandler)
  {
    if (paramMediaInfoEventHandler == null) {
      return;
    }
    Object localObject = this.OooO0OO;
    int i = ((HashMap)localObject).size();
    if (i > 0)
    {
      localObject = this.OooO0OO.entrySet().iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject).hasNext();
        if (!bool) {
          break;
        }
        QGBusEvent localQGBusEvent = (QGBusEvent)((Map.Entry)((Iterator)localObject).next()).getValue();
        if (localQGBusEvent != null) {
          OooOOo0(localQGBusEvent, paramMediaInfoEventHandler);
        }
      }
    }
  }
  
  public final boolean OooOOOO(QGBusEvent paramQGBusEvent)
  {
    String str1 = paramQGBusEvent.getEventType();
    String str2 = m54207b69.F54207b69_11("3+664F51454E0969856A");
    boolean bool1 = str2.equals(str1);
    if (!bool1)
    {
      boolean bool2 = OooO0oo;
      if (bool2)
      {
        paramQGBusEvent = m54207b69.F54207b69_11(";%6841434F4871514A52695D4B575E7B4F5966526A");
        str1 = m54207b69.F54207b69_11("RO6E032C2E2A33660E220F79483648484C31");
        Log.OooO00o(paramQGBusEvent, str1);
      }
      return false;
    }
    return OooOOOo(paramQGBusEvent);
  }
  
  public final boolean OooOOOo(QGBusEvent paramQGBusEvent)
  {
    Object localObject = paramQGBusEvent.getData();
    int i = 1;
    if (localObject == null) {
      return i;
    }
    String str1 = paramQGBusEvent.getEventType();
    String str2 = m54207b69.F54207b69_11(";o1F0F0E07120D10");
    str2 = ((BaseBundle)localObject).getString(str2);
    if (str2 == null) {
      str2 = paramQGBusEvent.getSource();
    }
    if (str2 != null) {
      this.OooO0O0 = str2;
    }
    paramQGBusEvent = m54207b69.F54207b69_11("J)5D515B4F");
    boolean bool1 = false;
    int j = ((BaseBundle)localObject).getInt(paramQGBusEvent, 0);
    this.OooO00o = j;
    boolean bool2 = OooO0oo;
    String str3 = m54207b69.F54207b69_11(";%6841434F4871514A52695D4B575E7B4F5966526A");
    String str4;
    if (bool2)
    {
      paramQGBusEvent = new java/lang/StringBuilder;
      paramQGBusEvent.<init>();
      str4 = m54207b69.F54207b69_11("@9745D5F535C7D4F50754953671026");
      paramQGBusEvent.append(str4);
      int m = this.OooO00o;
      paramQGBusEvent.append(m);
      paramQGBusEvent = paramQGBusEvent.toString();
      Log.OooO00o(str3, paramQGBusEvent);
    }
    int k = this.OooO00o;
    if (k == 0)
    {
      paramQGBusEvent = m54207b69.F54207b69_11("8n230C0C0A13342425422028165A280E1410122B13");
      Log.OooO0oO(str3, paramQGBusEvent);
    }
    else
    {
      str3 = m54207b69.F54207b69_11("I|15103C200E");
      str4 = "src";
      String str5 = m54207b69.F54207b69_11("8h09050C20092B0F0C15");
      String str6 = m54207b69.F54207b69_11("NI2729262F");
      String str7 = "";
      if (k == i)
      {
        paramQGBusEvent = new com/qinggan/media/MusicInfo;
        paramQGBusEvent.<init>();
        str6 = ((BaseBundle)localObject).getString(str6, str7);
        paramQGBusEvent.setSongName(str6);
        str6 = m54207b69.F54207b69_11("5'465655515858");
        str6 = ((BaseBundle)localObject).getString(str6, str7);
        paramQGBusEvent.setArtist(str6);
        str5 = ((BaseBundle)localObject).getString(str5, str7);
        paramQGBusEvent.setAlbumName(str5);
        str5 = m54207b69.F54207b69_11("y+4A484B614A80484F");
        str5 = ((BaseBundle)localObject).getString(str5, str7);
        paramQGBusEvent.setAlbumPicUrl(str5);
        str4 = ((BaseBundle)localObject).getString(str4, str7);
        paramQGBusEvent.setMusicSrc(str4);
        boolean bool3 = ((BaseBundle)localObject).getBoolean(str3);
        paramQGBusEvent.setFav(bool3);
        paramQGBusEvent.setPackageName(str2);
      }
      for (;;)
      {
        OooOo(str1, paramQGBusEvent);
        break;
        int n = 2;
        if (k != n) {
          break;
        }
        paramQGBusEvent = new com/qinggan/media/RadioInfo;
        paramQGBusEvent.<init>();
        str6 = ((BaseBundle)localObject).getString(str6);
        paramQGBusEvent.setName(str6);
        str6 = m54207b69.F54207b69_11("^]3B303A2F");
        str6 = ((BaseBundle)localObject).getString(str6);
        paramQGBusEvent.setFrequency(str6);
        str5 = ((BaseBundle)localObject).getString(str5);
        paramQGBusEvent.setAlbumeName(str5);
        str4 = ((BaseBundle)localObject).getString(str4, str7);
        paramQGBusEvent.setSrc(str4);
        bool1 = ((BaseBundle)localObject).getBoolean(str3);
        paramQGBusEvent.setFav(bool1);
        paramQGBusEvent.setPackageName(str2);
        str2 = m54207b69.F54207b69_11("FV373B36263F0E3B40283C2E142F3148");
        localObject = ((BaseBundle)localObject).getString(str2, str7);
        paramQGBusEvent.setAlbumCoverUrl((String)localObject);
      }
    }
    return i;
  }
  
  public final boolean OooOOo(QGBusEvent paramQGBusEvent)
  {
    Object localObject1 = paramQGBusEvent.getEventType();
    boolean bool1 = m54207b69.F54207b69_11("&b2F08080E075229352840393D372E").equals(localObject1);
    Object localObject2 = m54207b69.F54207b69_11(";%6841434F4871514A52695D4B575E7B4F5966526A");
    if (!bool1)
    {
      boolean bool2 = OooO0oo;
      if (bool2)
      {
        paramQGBusEvent = m54207b69.F54207b69_11("fO6E032C2E2A3366150B16240D2B131A7E4D3B4D4D5136");
        Log.OooO00o((String)localObject2, paramQGBusEvent);
      }
      return false;
    }
    bool1 = OooO0oo;
    if ((bool1) && (bool1))
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = m54207b69.F54207b69_11("`o2E040F1D06240C13571323150D284F171A2C4E132E3222215F5F6F");
      ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = paramQGBusEvent.getSource();
      ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).toString();
      Log.OooO00o((String)localObject2, (String)localObject1);
    }
    paramQGBusEvent = paramQGBusEvent.getData();
    bool1 = true;
    if (paramQGBusEvent == null) {
      return bool1;
    }
    Object localObject3 = "key";
    String str = "";
    paramQGBusEvent = paramQGBusEvent.getString((String)localObject3, str);
    boolean bool3 = OooO0oo;
    if (bool3)
    {
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      str = m54207b69.F54207b69_11("5+404F5419");
      ((StringBuilder)localObject3).append(str);
      ((StringBuilder)localObject3).append(paramQGBusEvent);
      str = m54207b69.F54207b69_11("5a411215110A180A191A");
      ((StringBuilder)localObject3).append(str);
      localObject3 = ((StringBuilder)localObject3).toString();
      Log.OooO00o((String)localObject2, (String)localObject3);
    }
    localObject2 = this.OooO0Oo;
    if (localObject2 != null)
    {
      localObject2 = ((List)localObject2).iterator();
      for (;;)
      {
        bool3 = ((Iterator)localObject2).hasNext();
        if (!bool3) {
          break;
        }
        localObject3 = (MediaInfoEventHelper.MediaInfoEventHandler)((Iterator)localObject2).next();
        ((MediaInfoEventHelper.MediaInfoEventHandler)localObject3).OooO0o(paramQGBusEvent);
      }
    }
    return bool1;
  }
  
  public final boolean OooOOo0(QGBusEvent paramQGBusEvent, MediaInfoEventHelper.MediaInfoEventHandler paramMediaInfoEventHandler)
  {
    int i = 1;
    if (paramQGBusEvent == null) {
      return i;
    }
    Object localObject = paramQGBusEvent.getData();
    if (localObject == null) {
      return i;
    }
    String str1 = paramQGBusEvent.getEventType();
    String str2 = m54207b69.F54207b69_11("_c2E07090D0651363E2A4030");
    boolean bool1 = str1.equals(str2);
    if (bool1)
    {
      OooOo0(paramQGBusEvent, paramMediaInfoEventHandler);
      return i;
    }
    str2 = m54207b69.F54207b69_11("lt3912122019602A2D433C303C3334");
    bool1 = str1.equals(str2);
    if (bool1)
    {
      OooOo00(paramQGBusEvent, paramMediaInfoEventHandler);
      return i;
    }
    str2 = m54207b69.F54207b69_11(";o1F0F0E07120D10");
    str2 = ((BaseBundle)localObject).getString(str2);
    if (str2 == null) {
      str2 = paramQGBusEvent.getSource();
    }
    if (str2 != null) {
      this.OooO0O0 = str2;
    }
    paramQGBusEvent = m54207b69.F54207b69_11("J)5D515B4F");
    boolean bool2 = false;
    int j = ((BaseBundle)localObject).getInt(paramQGBusEvent, 0);
    this.OooO00o = j;
    boolean bool3 = OooO0oo;
    String str3 = m54207b69.F54207b69_11(";%6841434F4871514A52695D4B575E7B4F5966526A");
    String str4;
    if (bool3)
    {
      paramQGBusEvent = new java/lang/StringBuilder;
      paramQGBusEvent.<init>();
      str4 = m54207b69.F54207b69_11("@9745D5F535C7D4F50754953671026");
      paramQGBusEvent.append(str4);
      int m = this.OooO00o;
      paramQGBusEvent.append(m);
      paramQGBusEvent = paramQGBusEvent.toString();
      Log.OooO00o(str3, paramQGBusEvent);
    }
    int k = this.OooO00o;
    if (k == 0)
    {
      paramQGBusEvent = m54207b69.F54207b69_11("8n230C0C0A13342425422028165A280E1410122B13");
      Log.OooO0oO(str3, paramQGBusEvent);
    }
    else
    {
      str3 = m54207b69.F54207b69_11("I|15103C200E");
      str4 = "src";
      String str5 = m54207b69.F54207b69_11("8h09050C20092B0F0C15");
      String str6 = m54207b69.F54207b69_11("NI2729262F");
      String str7 = "";
      if (k == i)
      {
        paramQGBusEvent = new com/qinggan/media/MusicInfo;
        paramQGBusEvent.<init>();
        str6 = ((BaseBundle)localObject).getString(str6, str7);
        paramQGBusEvent.setSongName(str6);
        str6 = m54207b69.F54207b69_11("5'465655515858");
        str6 = ((BaseBundle)localObject).getString(str6, str7);
        paramQGBusEvent.setArtist(str6);
        str5 = ((BaseBundle)localObject).getString(str5, str7);
        paramQGBusEvent.setAlbumName(str5);
        str5 = m54207b69.F54207b69_11("y+4A484B614A80484F");
        str5 = ((BaseBundle)localObject).getString(str5, str7);
        paramQGBusEvent.setAlbumPicUrl(str5);
        str4 = ((BaseBundle)localObject).getString(str4, str7);
        paramQGBusEvent.setMusicSrc(str4);
        boolean bool4 = ((BaseBundle)localObject).getBoolean(str3);
        paramQGBusEvent.setFav(bool4);
        paramQGBusEvent.setPackageName(str2);
      }
      for (;;)
      {
        OooOoO0(str1, paramQGBusEvent, paramMediaInfoEventHandler);
        break;
        int n = 2;
        if (k != n) {
          break;
        }
        paramQGBusEvent = new com/qinggan/media/RadioInfo;
        paramQGBusEvent.<init>();
        str6 = ((BaseBundle)localObject).getString(str6);
        paramQGBusEvent.setName(str6);
        str6 = m54207b69.F54207b69_11("^]3B303A2F");
        str6 = ((BaseBundle)localObject).getString(str6);
        paramQGBusEvent.setFrequency(str6);
        str5 = ((BaseBundle)localObject).getString(str5);
        paramQGBusEvent.setAlbumeName(str5);
        str4 = ((BaseBundle)localObject).getString(str4, str7);
        paramQGBusEvent.setSrc(str4);
        bool2 = ((BaseBundle)localObject).getBoolean(str3);
        paramQGBusEvent.setFav(bool2);
        paramQGBusEvent.setPackageName(str2);
        str2 = m54207b69.F54207b69_11("FV373B36263F0E3B40283C2E142F3148");
        localObject = ((BaseBundle)localObject).getString(str2, str7);
        paramQGBusEvent.setAlbumCoverUrl((String)localObject);
      }
    }
    return i;
  }
  
  public final boolean OooOOoo(QGBusEvent paramQGBusEvent)
  {
    String str1 = paramQGBusEvent.getEventType();
    String str2 = m54207b69.F54207b69_11("*e2801030F084F32322B33");
    boolean bool = str2.equals(str1);
    if (!bool) {
      return false;
    }
    return OooOOOo(paramQGBusEvent);
  }
  
  public final void OooOo(String paramString, MediaInfo paramMediaInfo)
  {
    Object localObject1 = this.OooO0Oo;
    if (localObject1 != null)
    {
      localObject1 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        Object localObject2 = (MediaInfoEventHelper.MediaInfoEventHandler)((Iterator)localObject1).next();
        String str = m54207b69.F54207b69_11("*e2801030F084F32322B33");
        boolean bool2 = str.equals(paramString);
        if (bool2)
        {
          ((MediaInfoEventHelper.MediaInfoEventHandler)localObject2).OooO0Oo(paramMediaInfo);
        }
        else
        {
          str = m54207b69.F54207b69_11("gS1E37393D36811B190D23272028");
          bool2 = str.equals(paramString);
          if (bool2)
          {
            bool2 = localObject2 instanceof MediaInfoEventHelper.MediaEventHandler;
            if (bool2)
            {
              localObject2 = (MediaInfoEventHelper.MediaEventHandler)localObject2;
              ((MediaInfoEventHelper.MediaEventHandler)localObject2).OooO0o0(paramMediaInfo);
              continue;
            }
          }
          str = m54207b69.F54207b69_11("3+664F51454E0969856A");
          bool2 = str.equals(paramString);
          if (bool2)
          {
            bool2 = localObject2 instanceof MediaInfoEventHelper.MediaEventHandlerV2;
            if (bool2)
            {
              localObject2 = (MediaInfoEventHelper.MediaEventHandlerV2)localObject2;
              ((MediaInfoEventHelper.MediaEventHandlerV2)localObject2).OooO0oo(paramMediaInfo);
              continue;
            }
          }
          str = m54207b69.F54207b69_11("|>735C5C5A631679788284");
          bool2 = str.equals(paramString);
          if (bool2)
          {
            bool2 = localObject2 instanceof MediaInfoEventHelper.MediaEventHandlerV2;
            if (bool2)
            {
              localObject2 = (MediaInfoEventHelper.MediaEventHandlerV2)localObject2;
              bool2 = false;
              str = null;
              ((MediaInfoEventHelper.MediaEventHandlerV2)localObject2).OooO0OO(0);
            }
          }
        }
      }
    }
  }
  
  public final boolean OooOo0(QGBusEvent paramQGBusEvent, MediaInfoEventHelper.MediaInfoEventHandler paramMediaInfoEventHandler)
  {
    Object localObject = paramQGBusEvent.getEventType();
    boolean bool1 = m54207b69.F54207b69_11("_c2E07090D0651363E2A4030").equals(localObject);
    int j = 0;
    String str1 = m54207b69.F54207b69_11(";%6841434F4871514A52695D4B575E7B4F5966526A");
    if (!bool1)
    {
      bool3 = OooO0oo;
      if (bool3)
      {
        paramQGBusEvent = m54207b69.F54207b69_11("9:1B78616157601B707684788A26556D5D5F5966");
        Log.OooO00o(str1, paramQGBusEvent);
      }
      return false;
    }
    localObject = paramQGBusEvent.getData();
    boolean bool4 = true;
    if (localObject == null) {
      return bool4;
    }
    String str2 = m54207b69.F54207b69_11("J)5D515B4F");
    int k = ((BaseBundle)localObject).getInt(str2, 0);
    this.OooO00o = k;
    str2 = m54207b69.F54207b69_11("TC3038243A2A");
    j = ((BaseBundle)localObject).getInt(str2, 0);
    str2 = m54207b69.F54207b69_11(";o1F0F0E07120D10");
    localObject = ((BaseBundle)localObject).getString(str2);
    if (localObject == null)
    {
      bool1 = OooO0oo;
      if (bool1)
      {
        localObject = m54207b69.F54207b69_11("074757565F5A55581E121321644E6869");
        Log.OooO00o(str1, (String)localObject);
      }
      localObject = paramQGBusEvent.getSource();
    }
    boolean bool3 = OooO0oo;
    if (bool3)
    {
      paramQGBusEvent = new java/lang/StringBuilder;
      paramQGBusEvent.<init>();
      str2 = m54207b69.F54207b69_11("sp0012151E151C1B4519261F55");
      paramQGBusEvent.append(str2);
      paramQGBusEvent.append((String)localObject);
      str2 = m54207b69.F54207b69_11("?z565B0B111F132547");
      paramQGBusEvent.append(str2);
      paramQGBusEvent.append(j);
      str2 = m54207b69.F54207b69_11("E418155B5454625B67554D5B19");
      paramQGBusEvent.append(str2);
      k = this.OooO00o;
      paramQGBusEvent.append(k);
      paramQGBusEvent = paramQGBusEvent.toString();
      Log.OooO00o(str1, paramQGBusEvent);
    }
    paramQGBusEvent = new com/qinggan/media/MediaInfo;
    paramQGBusEvent.<init>();
    k = this.OooO00o;
    paramQGBusEvent.setType(k);
    paramQGBusEvent.setPackageName((String)localObject);
    int i = this.OooO00o;
    if (i == 0)
    {
      paramQGBusEvent = m54207b69.F54207b69_11("8n230C0C0A13342425422028165A280E1410122B13");
      Log.OooO0oO(str1, paramQGBusEvent);
    }
    else if (paramMediaInfoEventHandler != null)
    {
      paramMediaInfoEventHandler.OooO(paramQGBusEvent, j);
    }
    else
    {
      paramMediaInfoEventHandler = this.OooO0Oo;
      if (paramMediaInfoEventHandler != null)
      {
        paramMediaInfoEventHandler = paramMediaInfoEventHandler.iterator();
        for (;;)
        {
          boolean bool2 = paramMediaInfoEventHandler.hasNext();
          if (!bool2) {
            break;
          }
          localObject = (MediaInfoEventHelper.MediaInfoEventHandler)paramMediaInfoEventHandler.next();
          ((MediaInfoEventHelper.MediaInfoEventHandler)localObject).OooO(paramQGBusEvent, j);
        }
      }
    }
    return bool4;
  }
  
  public final boolean OooOo00(QGBusEvent paramQGBusEvent, MediaInfoEventHelper.MediaInfoEventHandler paramMediaInfoEventHandler)
  {
    Object localObject1 = paramQGBusEvent.getEventType();
    Object localObject2 = m54207b69.F54207b69_11("lt3912122019602A2D433C303C3334");
    boolean bool1 = ((String)localObject2).equals(localObject1);
    String str1 = m54207b69.F54207b69_11("J^133C3C3A4376141319221626191A0F2A161B");
    String str2 = m54207b69.F54207b69_11(";%6841434F4871514A52695D4B575E7B4F5966526A");
    int j = 0;
    if (!bool1)
    {
      bool1 = str1.equals(localObject1);
      if (!bool1)
      {
        bool3 = OooO0oo;
        if (bool3)
        {
          paramQGBusEvent = m54207b69.F54207b69_11("@y58351E20141D5C30333F4836483738681B2D1F1F1F2C");
          Log.OooO00o(str2, paramQGBusEvent);
        }
        return false;
      }
    }
    localObject2 = paramQGBusEvent.getData();
    boolean bool4 = true;
    if (localObject2 == null) {
      return bool4;
    }
    String str3 = m54207b69.F54207b69_11("J)5D515B4F");
    int k = ((BaseBundle)localObject2).getInt(str3, 0);
    this.OooO00o = k;
    str3 = m54207b69.F54207b69_11(":[373F373F3338");
    k = ((BaseBundle)localObject2).getInt(str3, 0);
    String str4 = m54207b69.F54207b69_11("jl1C1F050E220E2526");
    int m = ((BaseBundle)localObject2).getInt(str4, 0);
    boolean bool5 = str1.equals(localObject1);
    if (bool5)
    {
      localObject1 = m54207b69.F54207b69_11(":n0D1C1E3D0B0811");
      j = ((BaseBundle)localObject2).getInt((String)localObject1, 0);
    }
    localObject1 = m54207b69.F54207b69_11(";o1F0F0E07120D10");
    localObject1 = ((BaseBundle)localObject2).getString((String)localObject1);
    if (localObject1 == null)
    {
      bool5 = OooO0oo;
      if (bool5)
      {
        localObject1 = m54207b69.F54207b69_11("074757565F5A55581E121321644E6869");
        Log.OooO00o(str2, (String)localObject1);
      }
      localObject1 = paramQGBusEvent.getSource();
    }
    boolean bool3 = OooO0oo;
    if (bool3)
    {
      paramQGBusEvent = new java/lang/StringBuilder;
      paramQGBusEvent.<init>();
      localObject2 = m54207b69.F54207b69_11("sp0012151E151C1B4519261F55");
      paramQGBusEvent.append((String)localObject2);
      paramQGBusEvent.append((String)localObject1);
      paramQGBusEvent = paramQGBusEvent.toString();
      Log.OooO00o(str2, paramQGBusEvent);
    }
    paramQGBusEvent = new com/qinggan/media/MediaInfo;
    paramQGBusEvent.<init>();
    int i = this.OooO00o;
    paramQGBusEvent.setType(i);
    paramQGBusEvent.setPackageName((String)localObject1);
    bool5 = OooO0oo;
    if ((bool5) && (bool5))
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("Qk260F11050E4941402C354339444559161E161E321766");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(k);
      localObject2 = m54207b69.F54207b69_11("$61A47465C5549594C4D15");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(m);
      localObject2 = " currentMediaAppType：";
      ((StringBuilder)localObject1).append((String)localObject2);
      i = this.OooO00o;
      ((StringBuilder)localObject1).append(i);
      localObject1 = ((StringBuilder)localObject1).toString();
      Log.OooO00o(str2, (String)localObject1);
    }
    int n = this.OooO00o;
    if (n == 0)
    {
      bool3 = OooO0oo;
      if (bool3)
      {
        paramQGBusEvent = m54207b69.F54207b69_11("8n230C0C0A13342425422028165A280E1410122B13");
        Log.OooO00o(str2, paramQGBusEvent);
      }
    }
    else
    {
      boolean bool6;
      if (paramMediaInfoEventHandler != null)
      {
        bool6 = paramMediaInfoEventHandler instanceof MediaInfoEventHelper.MediaEventHandlerExt;
        if (bool6)
        {
          paramMediaInfoEventHandler = (MediaInfoEventHelper.MediaEventHandlerExt)paramMediaInfoEventHandler;
          paramMediaInfoEventHandler.OooO0O0(paramQGBusEvent, j, k, m);
        }
        else
        {
          paramMediaInfoEventHandler.OooO0oO(paramQGBusEvent, k, m);
        }
      }
      else
      {
        paramMediaInfoEventHandler = this.OooO0Oo;
        if (paramMediaInfoEventHandler != null)
        {
          paramMediaInfoEventHandler = paramMediaInfoEventHandler.iterator();
          for (;;)
          {
            bool6 = paramMediaInfoEventHandler.hasNext();
            if (!bool6) {
              break;
            }
            localObject1 = (MediaInfoEventHelper.MediaInfoEventHandler)paramMediaInfoEventHandler.next();
            boolean bool2 = localObject1 instanceof MediaInfoEventHelper.MediaEventHandlerExt;
            if (bool2)
            {
              localObject1 = (MediaInfoEventHelper.MediaEventHandlerExt)localObject1;
              ((MediaInfoEventHelper.MediaEventHandlerExt)localObject1).OooO0O0(paramQGBusEvent, j, k, m);
            }
            else
            {
              ((MediaInfoEventHelper.MediaInfoEventHandler)localObject1).OooO0oO(paramQGBusEvent, k, m);
            }
          }
        }
      }
    }
    return bool4;
  }
  
  public final boolean OooOo0O(QGBusEvent paramQGBusEvent)
  {
    String str1 = paramQGBusEvent.getEventType();
    String str2 = m54207b69.F54207b69_11("|>735C5C5A631679788284");
    boolean bool1 = str2.equals(str1);
    if (!bool1)
    {
      boolean bool2 = OooO0oo;
      if (bool2)
      {
        paramQGBusEvent = m54207b69.F54207b69_11(";%6841434F4871514A52695D4B575E7B4F5966526A");
        str1 = m54207b69.F54207b69_11("DE640922243029700F120A0A70432D3F3F473C");
        Log.OooO00o(paramQGBusEvent, str1);
      }
      return false;
    }
    return OooOOOo(paramQGBusEvent);
  }
  
  public final boolean OooOo0o(QGBusEvent paramQGBusEvent)
  {
    String str1 = paramQGBusEvent.getEventType();
    boolean bool1 = m54207b69.F54207b69_11("OG0A2325312A6D1A091E1C28220E").equals(str1);
    boolean bool2 = false;
    Object localObject1 = null;
    String str2 = m54207b69.F54207b69_11(";%6841434F4871514A52695D4B575E7B4F5966526A");
    if (!bool1)
    {
      boolean bool3 = OooO0oo;
      if (bool3)
      {
        paramQGBusEvent = m54207b69.F54207b69_11("0U741932344039800D180D0B17111D83364032323A4F");
        Log.OooO00o(str2, paramQGBusEvent);
      }
      return false;
    }
    paramQGBusEvent = paramQGBusEvent.getData();
    bool1 = true;
    if (paramQGBusEvent == null) {
      return bool1;
    }
    Object localObject2 = m54207b69.F54207b69_11(">v05140905130B19");
    int i = paramQGBusEvent.getInt((String)localObject2, 0);
    bool2 = OooO0oo;
    if ((bool2) && (bool2))
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("?-60494B475007846F84827E88741A6C576C6A66705C2C");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(i);
      localObject1 = ((StringBuilder)localObject1).toString();
      Log.OooO00o(str2, (String)localObject1);
    }
    localObject1 = this.OooO0Oo;
    if (localObject1 != null)
    {
      localObject1 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool4 = ((Iterator)localObject1).hasNext();
        if (!bool4) {
          break;
        }
        localObject2 = (MediaInfoEventHelper.MediaInfoEventHandler)((Iterator)localObject1).next();
        boolean bool5 = localObject2 instanceof MediaInfoEventHelper.MediaEventHandlerExt2;
        if (bool5)
        {
          bool5 = OooO0oo;
          if (bool5)
          {
            String str3 = m54207b69.F54207b69_11("vE0821232F28053927333A172F372E372F47114F44793F411F383A463F323D52305C56422951495149484A");
            Log.OooO00o(str2, str3);
          }
          localObject2 = (MediaInfoEventHelper.MediaEventHandlerExt2)localObject2;
          ((MediaInfoEventHelper.MediaEventHandlerExt2)localObject2).OooO00o(i);
        }
      }
    }
    return bool1;
  }
  
  public final void OooOoO()
  {
    Object localObject1 = this.OooO0o;
    if (localObject1 != null)
    {
      localObject1 = new com/qinggan/bus/QGBusEventFilter;
      ((QGBusEventFilter)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("*e2801030F084F32322B33");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("gS1E37393D36811B190D23272028");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("3+664F51454E0969856A");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("|>735C5C5A631679788284");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("_c2E07090D0651363E2A4030");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("lt3912122019602A2D433C303C3334");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("J^133C3C3A4376141319221626191A0F2A161B");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("&b2F08080E075229352840393D372E");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("OG0A2325312A6D1A091E1C28220E");
      ((QGBusEventFilter)localObject1).OooO00o((String)localObject2);
      localObject2 = this.OooO0o;
      QGBusEventHandler localQGBusEventHandler = this.OooO0oO;
      ((QGBus)localObject2).OooO0O0((QGBusEventFilter)localObject1, localQGBusEventHandler);
    }
  }
  
  public final void OooOoO0(String paramString, MediaInfo paramMediaInfo, MediaInfoEventHelper.MediaInfoEventHandler paramMediaInfoEventHandler)
  {
    if (paramMediaInfoEventHandler != null)
    {
      Object localObject = m54207b69.F54207b69_11("*e2801030F084F32322B33");
      boolean bool1 = ((String)localObject).equals(paramString);
      if (bool1) {
        paramMediaInfoEventHandler.OooO0Oo(paramMediaInfo);
      }
      localObject = m54207b69.F54207b69_11("gS1E37393D36811B190D23272028");
      bool1 = ((String)localObject).equals(paramString);
      if (bool1)
      {
        bool1 = paramMediaInfoEventHandler instanceof MediaInfoEventHelper.MediaEventHandler;
        if (bool1)
        {
          localObject = paramMediaInfoEventHandler;
          localObject = (MediaInfoEventHelper.MediaEventHandler)paramMediaInfoEventHandler;
          ((MediaInfoEventHelper.MediaEventHandler)localObject).OooO0o0(paramMediaInfo);
        }
      }
      localObject = m54207b69.F54207b69_11("3+664F51454E0969856A");
      bool1 = ((String)localObject).equals(paramString);
      if (bool1)
      {
        bool1 = paramMediaInfoEventHandler instanceof MediaInfoEventHelper.MediaEventHandlerV2;
        if (bool1)
        {
          localObject = paramMediaInfoEventHandler;
          localObject = (MediaInfoEventHelper.MediaEventHandlerV2)paramMediaInfoEventHandler;
          ((MediaInfoEventHelper.MediaEventHandlerV2)localObject).OooO0oo(paramMediaInfo);
        }
      }
      paramMediaInfo = m54207b69.F54207b69_11("|>735C5C5A631679788284");
      boolean bool2 = paramMediaInfo.equals(paramString);
      if (bool2)
      {
        bool2 = paramMediaInfoEventHandler instanceof MediaInfoEventHelper.MediaEventHandlerV2;
        if (bool2)
        {
          paramMediaInfoEventHandler = (MediaInfoEventHelper.MediaEventHandlerV2)paramMediaInfoEventHandler;
          bool2 = false;
          paramString = null;
          paramMediaInfoEventHandler.OooO0OO(0);
        }
      }
    }
  }
  
  public int getCurrentMediaAppType()
  {
    return this.OooO00o;
  }
  
  public String getCurrentMediaPackagerName()
  {
    return this.OooO0O0;
  }
  
  public void setCurrentMediaAppType(int paramInt)
  {
    this.OooO00o = paramInt;
  }
  
  public void setDebug(boolean paramBoolean)
  {
    OooO0oo = paramBoolean;
  }
  
  public void setMediaInfoEventHandler(MediaInfoEventHelper.MediaInfoEventHandler paramMediaInfoEventHandler)
  {
    if (paramMediaInfoEventHandler == null) {
      paramMediaInfoEventHandler = ";%6841434F4871514A52695D4B575E7B4F5966526A";
    }
    try
    {
      paramMediaInfoEventHandler = m54207b69.F54207b69_11(paramMediaInfoEventHandler);
      localObject = "Cs001709333558441D1F231C4529222A4515272F1A4F27332E372F1B6E361D713C264041";
      localObject = m54207b69.F54207b69_11((String)localObject);
      Log.OooO0O0(paramMediaInfoEventHandler, (String)localObject);
      return;
    }
    finally {}
    Object localObject = this.OooO0Oo;
    if (localObject != null)
    {
      boolean bool = ((List)localObject).isEmpty();
      if (bool) {
        OooOoO();
      }
    }
    localObject = this.OooO0Oo;
    if (localObject != null)
    {
      ((List)localObject).add(paramMediaInfoEventHandler);
      OooOOO0(paramMediaInfoEventHandler);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.media.MediaInfoEventHelper
 * JD-Core Version:    0.7.0.1
 */