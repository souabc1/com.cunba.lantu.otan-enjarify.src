package androidx.core.net;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class MailTo
{
  public HashMap OooO00o;
  
  private MailTo()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO00o = localHashMap;
  }
  
  public String getBcc()
  {
    return (String)this.OooO00o.get("bcc");
  }
  
  public String getBody()
  {
    return (String)this.OooO00o.get("body");
  }
  
  public String getCc()
  {
    return (String)this.OooO00o.get("cc");
  }
  
  public Map getHeaders()
  {
    return this.OooO00o;
  }
  
  public String getSubject()
  {
    return (String)this.OooO00o.get("subject");
  }
  
  public String getTo()
  {
    return (String)this.OooO00o.get("to");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("mailto:");
    char c1 = '?';
    localStringBuilder.append(c1);
    Iterator localIterator = this.OooO00o.entrySet().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (Map.Entry)localIterator.next();
      String str = Uri.encode((String)((Map.Entry)localObject).getKey());
      localStringBuilder.append(str);
      char c3 = '=';
      localStringBuilder.append(c3);
      localObject = Uri.encode((String)((Map.Entry)localObject).getValue());
      localStringBuilder.append((String)localObject);
      char c2 = '&';
      localStringBuilder.append(c2);
    }
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.net.MailTo
 * JD-Core Version:    0.7.0.1
 */