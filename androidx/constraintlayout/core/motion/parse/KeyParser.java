package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.io.PrintStream;

public class KeyParser
{
  public static TypedBundle OooO00o(String paramString, KeyParser.Ids paramIds, KeyParser.DataType paramDataType)
  {
    localTypedBundle = new androidx/constraintlayout/core/motion/utils/TypedBundle;
    localTypedBundle.<init>();
    try
    {
      paramString = CLParser.OooO0Oo(paramString);
      int i = paramString.size();
      int j = 0;
      while (j < i)
      {
        Object localObject1 = paramString.get(j);
        localObject1 = (CLKey)localObject1;
        String str1 = ((CLElement)localObject1).OooO00o();
        localObject1 = ((CLKey)localObject1).getValue();
        int k = paramIds.get(str1);
        int m = -1;
        float f1 = 0.0F / 0.0F;
        Object localObject2;
        Object localObject3;
        if (k == m)
        {
          localObject1 = System.err;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = "unknown type ";
          ((StringBuilder)localObject2).append((String)localObject3);
          ((StringBuilder)localObject2).append(str1);
          str1 = ((StringBuilder)localObject2).toString();
          ((PrintStream)localObject1).println(str1);
        }
        else
        {
          m = paramDataType.get(k);
          int n = 1;
          if (m != n)
          {
            n = 2;
            String str2 = "parse ";
            if (m != n)
            {
              n = 4;
              if (m != n)
              {
                n = 8;
                if (m != n) {
                  break label465;
                }
                localObject3 = ((CLElement)localObject1).OooO00o();
                localTypedBundle.OooO0OO(k, (String)localObject3);
                localObject2 = System.out;
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                ((StringBuilder)localObject3).append(str2);
                ((StringBuilder)localObject3).append(str1);
                str1 = " STRING_MASK > ";
                ((StringBuilder)localObject3).append(str1);
                localObject1 = ((CLElement)localObject1).OooO00o();
                ((StringBuilder)localObject3).append((String)localObject1);
                localObject1 = ((StringBuilder)localObject3).toString();
              }
            }
            for (;;)
            {
              ((PrintStream)localObject2).println((String)localObject1);
              break;
              f1 = ((CLElement)localObject1).getFloat();
              localTypedBundle.OooO00o(k, f1);
              localObject2 = System.out;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((StringBuilder)localObject3).append(str2);
              ((StringBuilder)localObject3).append(str1);
              str1 = " FLOAT_MASK > ";
              ((StringBuilder)localObject3).append(str1);
              float f2 = ((CLElement)localObject1).getFloat();
              ((StringBuilder)localObject3).append(f2);
              localObject1 = ((StringBuilder)localObject3).toString();
              continue;
              m = ((CLElement)localObject1).getInt();
              localTypedBundle.OooO0O0(k, m);
              localObject2 = System.out;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((StringBuilder)localObject3).append(str2);
              ((StringBuilder)localObject3).append(str1);
              str1 = " INT_MASK > ";
              ((StringBuilder)localObject3).append(str1);
              int i1 = ((CLElement)localObject1).getInt();
              ((StringBuilder)localObject3).append(i1);
              localObject1 = ((StringBuilder)localObject3).toString();
            }
          }
          else
          {
            boolean bool = paramString.getBoolean(j);
            localTypedBundle.OooO0Oo(k, bool);
          }
        }
        label465:
        j += 1;
      }
      return localTypedBundle;
    }
    catch (CLParsingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public static TypedBundle OooO0O0(String paramString)
  {
    OooO00o localOooO00o = new androidx/constraintlayout/core/motion/parse/OooO00o;
    localOooO00o.<init>();
    OooO0O0 localOooO0O0 = new androidx/constraintlayout/core/motion/parse/OooO0O0;
    localOooO0O0.<init>();
    return OooO00o(paramString, localOooO00o, localOooO0O0);
  }
  
  public static void main(String[] paramArrayOfString)
  {
    OooO0O0("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.parse.KeyParser
 * JD-Core Version:    0.7.0.1
 */