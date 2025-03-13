package com.cunba.lantu.otan.telnet;

import com.cunba.lantu.otan.utils.MMKVUtil;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.locks.ReentrantLock;
import m54207b69;

public class Telnet
  implements Runnable
{
  public static final boolean[] o00o00oO;
  public static final boolean[] o00o00oo;
  public boolean o00OoOoo = false;
  public final byte[] o00Ooo0;
  public boolean o00Ooo00 = false;
  public final ReentrantLock o00Ooo0O;
  public boolean[] o00Ooo0o;
  public Socket o00OooO;
  public boolean[] o00OooO0;
  public OutputStream o00OooOO;
  public InputStream o00OooOo;
  public boolean o00OoooO;
  public int o00Ooooo;
  public String o00o00;
  public int o00o000;
  public int o00o0000;
  public Telnet.Context o00o000O;
  public String o00o000o;
  public StringBuffer o00o00O0;
  public OutputStream o00o00Oo;
  public int o00o00o;
  public String o00o00o0;
  public BufferedReader o0O00o0;
  public boolean oo00oO;
  
  static
  {
    int i = 41;
    boolean[] arrayOfBoolean1 = new boolean[i];
    boolean[] tmp8_7 = arrayOfBoolean1;
    boolean[] tmp9_8 = tmp8_7;
    boolean[] tmp9_8 = tmp8_7;
    tmp9_8[0] = 1;
    tmp9_8[1] = 0;
    boolean[] tmp16_9 = tmp9_8;
    boolean[] tmp16_9 = tmp9_8;
    tmp16_9[2] = 0;
    tmp16_9[3] = 1;
    boolean[] tmp23_16 = tmp16_9;
    boolean[] tmp23_16 = tmp16_9;
    tmp23_16[4] = 0;
    tmp23_16[5] = 0;
    boolean[] tmp30_23 = tmp23_16;
    boolean[] tmp30_23 = tmp23_16;
    tmp30_23[6] = 0;
    tmp30_23[7] = 0;
    boolean[] tmp39_30 = tmp30_23;
    boolean[] tmp39_30 = tmp30_23;
    tmp39_30[8] = 0;
    tmp39_30[9] = 0;
    boolean[] tmp48_39 = tmp39_30;
    boolean[] tmp48_39 = tmp39_30;
    tmp48_39[10] = 0;
    tmp48_39[11] = 0;
    boolean[] tmp57_48 = tmp48_39;
    boolean[] tmp57_48 = tmp48_39;
    tmp57_48[12] = 1;
    tmp57_48[13] = 0;
    boolean[] tmp66_57 = tmp57_48;
    boolean[] tmp66_57 = tmp57_48;
    tmp66_57[14] = 0;
    tmp66_57[15] = 0;
    boolean[] tmp75_66 = tmp66_57;
    boolean[] tmp75_66 = tmp66_57;
    tmp75_66[16] = 0;
    tmp75_66[17] = 0;
    boolean[] tmp84_75 = tmp75_66;
    boolean[] tmp84_75 = tmp75_66;
    tmp84_75[18] = 0;
    tmp84_75[19] = 0;
    boolean[] tmp93_84 = tmp84_75;
    boolean[] tmp93_84 = tmp84_75;
    tmp93_84[20] = 0;
    tmp93_84[21] = 0;
    boolean[] tmp102_93 = tmp93_84;
    boolean[] tmp102_93 = tmp93_84;
    tmp102_93[22] = 0;
    tmp102_93[23] = 0;
    boolean[] tmp111_102 = tmp102_93;
    boolean[] tmp111_102 = tmp102_93;
    tmp111_102[24] = 1;
    tmp111_102[25] = 0;
    boolean[] tmp120_111 = tmp111_102;
    boolean[] tmp120_111 = tmp111_102;
    tmp120_111[26] = 0;
    tmp120_111[27] = 0;
    boolean[] tmp129_120 = tmp120_111;
    boolean[] tmp129_120 = tmp120_111;
    tmp129_120[28] = 0;
    tmp129_120[29] = 0;
    boolean[] tmp138_129 = tmp129_120;
    boolean[] tmp138_129 = tmp129_120;
    tmp138_129[30] = 0;
    tmp138_129[31] = 1;
    boolean[] tmp147_138 = tmp138_129;
    boolean[] tmp147_138 = tmp138_129;
    tmp147_138[32] = 1;
    tmp147_138[33] = 0;
    boolean[] tmp156_147 = tmp147_138;
    boolean[] tmp156_147 = tmp147_138;
    tmp156_147[34] = 0;
    tmp156_147[35] = 0;
    boolean[] tmp165_156 = tmp156_147;
    boolean[] tmp165_156 = tmp156_147;
    tmp165_156[36] = 0;
    tmp165_156[37] = 0;
    tmp165_156[38] = 0;
    boolean[] tmp178_165 = tmp165_156;
    tmp178_165[39] = 0;
    tmp178_165[40] = 0;
    o00o00oO = arrayOfBoolean1;
    boolean[] arrayOfBoolean2 = new boolean[i];
    boolean[] tmp196_195 = arrayOfBoolean2;
    boolean[] tmp197_196 = tmp196_195;
    boolean[] tmp197_196 = tmp196_195;
    tmp197_196[0] = 1;
    tmp197_196[1] = 1;
    boolean[] tmp204_197 = tmp197_196;
    boolean[] tmp204_197 = tmp197_196;
    tmp204_197[2] = 0;
    tmp204_197[3] = 1;
    boolean[] tmp211_204 = tmp204_197;
    boolean[] tmp211_204 = tmp204_197;
    tmp211_204[4] = 0;
    tmp211_204[5] = 0;
    boolean[] tmp218_211 = tmp211_204;
    boolean[] tmp218_211 = tmp211_204;
    tmp218_211[6] = 0;
    tmp218_211[7] = 0;
    boolean[] tmp227_218 = tmp218_211;
    boolean[] tmp227_218 = tmp218_211;
    tmp227_218[8] = 0;
    tmp227_218[9] = 0;
    boolean[] tmp236_227 = tmp227_218;
    boolean[] tmp236_227 = tmp227_218;
    tmp236_227[10] = 0;
    tmp236_227[11] = 0;
    boolean[] tmp245_236 = tmp236_227;
    boolean[] tmp245_236 = tmp236_227;
    tmp245_236[12] = 0;
    tmp245_236[13] = 0;
    boolean[] tmp254_245 = tmp245_236;
    boolean[] tmp254_245 = tmp245_236;
    tmp254_245[14] = 0;
    tmp254_245[15] = 0;
    boolean[] tmp263_254 = tmp254_245;
    boolean[] tmp263_254 = tmp254_245;
    tmp263_254[16] = 0;
    tmp263_254[17] = 0;
    boolean[] tmp272_263 = tmp263_254;
    boolean[] tmp272_263 = tmp263_254;
    tmp272_263[18] = 0;
    tmp272_263[19] = 0;
    boolean[] tmp281_272 = tmp272_263;
    boolean[] tmp281_272 = tmp272_263;
    tmp281_272[20] = 0;
    tmp281_272[21] = 0;
    boolean[] tmp290_281 = tmp281_272;
    boolean[] tmp290_281 = tmp281_272;
    tmp290_281[22] = 0;
    tmp290_281[23] = 0;
    boolean[] tmp299_290 = tmp290_281;
    boolean[] tmp299_290 = tmp290_281;
    tmp299_290[24] = 0;
    tmp299_290[25] = 0;
    boolean[] tmp308_299 = tmp299_290;
    boolean[] tmp308_299 = tmp299_290;
    tmp308_299[26] = 0;
    tmp308_299[27] = 0;
    boolean[] tmp317_308 = tmp308_299;
    boolean[] tmp317_308 = tmp308_299;
    tmp317_308[28] = 0;
    tmp317_308[29] = 0;
    boolean[] tmp326_317 = tmp317_308;
    boolean[] tmp326_317 = tmp317_308;
    tmp326_317[30] = 0;
    tmp326_317[31] = 0;
    boolean[] tmp335_326 = tmp326_317;
    boolean[] tmp335_326 = tmp326_317;
    tmp335_326[32] = 0;
    tmp335_326[33] = 0;
    boolean[] tmp344_335 = tmp335_326;
    boolean[] tmp344_335 = tmp335_326;
    tmp344_335[34] = 0;
    tmp344_335[35] = 0;
    boolean[] tmp353_344 = tmp344_335;
    boolean[] tmp353_344 = tmp344_335;
    tmp353_344[36] = 0;
    tmp353_344[37] = 0;
    tmp353_344[38] = 0;
    boolean[] tmp366_353 = tmp353_344;
    tmp366_353[39] = 0;
    tmp366_353[40] = 0;
    o00o00oo = arrayOfBoolean2;
  }
  
  public Telnet()
  {
    Object localObject1 = "\r\n".getBytes();
    this.o00Ooo0 = ((byte[])localObject1);
    localObject1 = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject1).<init>();
    this.o00Ooo0O = ((ReentrantLock)localObject1);
    int i = 40;
    boolean[] arrayOfBoolean = new boolean[i];
    this.o00Ooo0o = arrayOfBoolean;
    localObject1 = new boolean[i];
    this.o00OooO0 = ((boolean[])localObject1);
    this.o00OoooO = false;
    int j = -1;
    this.o00Ooooo = j;
    this.o00o0000 = j;
    this.o00o000 = j;
    Object localObject2 = new com/cunba/lantu/otan/telnet/Telnet$Context;
    ((Telnet.Context)localObject2).<init>(this, null);
    this.o00o000O = ((Telnet.Context)localObject2);
    localObject2 = MMKVUtil.OooO0o0(m54207b69.F54207b69_11(".-59496143484852480B66694D4C4F67"), null);
    this.o00o00 = ((String)localObject2);
    localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    this.o00o00O0 = ((StringBuffer)localObject2);
    this.o00o00Oo = null;
    this.o00o00o0 = "";
    this.o00o00o = 23;
  }
  
  public void OooO(char paramChar)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Character localCharacter = Character.valueOf(paramChar);
    arrayOfObject[1] = localCharacter;
    m54207b69.F54207b69_00(474, arrayOfObject);
  }
  
  public boolean OooO00o(String paramString, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    return m54207b69.F54207b69_01(475, arrayOfObject);
  }
  
  public void OooO0O0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(476, arrayOfObject);
  }
  
  public void OooO0OO(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(477, arrayOfObject);
  }
  
  public final void OooO0Oo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(478, arrayOfObject);
  }
  
  public final void OooO0o(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(479, arrayOfObject);
  }
  
  public final void OooO0o0(char paramChar)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Character localCharacter = Character.valueOf(paramChar);
    arrayOfObject[1] = localCharacter;
    m54207b69.F54207b69_00(480, arrayOfObject);
  }
  
  public final void OooO0oO(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(481, arrayOfObject);
  }
  
  public int OooO0oo(byte[] paramArrayOfByte, int paramInt, byte paramByte)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfByte;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[2] = localObject;
    localObject = Byte.valueOf(paramByte);
    arrayOfObject[3] = localObject;
    return m54207b69.F54207b69_05(482, arrayOfObject);
  }
  
  public final void OooOO0(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(483, arrayOfObject);
  }
  
  public final void OooOO0O(byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfByte;
    m54207b69.F54207b69_00(484, arrayOfObject);
  }
  
  public final void OooOO0o(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfByte;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localInteger;
    m54207b69.F54207b69_00(485, arrayOfObject);
  }
  
  public final void OooOOO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(486, arrayOfObject);
  }
  
  public String OooOOO0(String paramString, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    return (String)m54207b69.F54207b69_09(487, arrayOfObject);
  }
  
  public final void OooOOOO(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(488, arrayOfObject);
  }
  
  public final void OooOOOo(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[3] = localObject;
    m54207b69.F54207b69_00(489, arrayOfObject);
  }
  
  public final void OooOOo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(490, arrayOfObject);
  }
  
  public final void OooOOo0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(491, arrayOfObject);
  }
  
  public final void OooOOoo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(492, arrayOfObject);
  }
  
  public boolean isCmd(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_01(493, arrayOfObject);
  }
  
  public boolean isConnected()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(494, arrayOfObject);
  }
  
  public boolean isImpLocOpt(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_01(495, arrayOfObject);
  }
  
  public boolean isImpRemOpt(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_01(496, arrayOfObject);
  }
  
  public boolean isOpt(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_01(497, arrayOfObject);
  }
  
  public void run()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(498, arrayOfObject);
  }
  
  public void setWindowSize(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(499, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.telnet.Telnet
 * JD-Core Version:    0.7.0.1
 */