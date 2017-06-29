package com.blaze.corejava.chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by sherlockblaze on 30/06/2017.
 * 写个程序计算阶乘 n! 使用BigInteger。计算1000的阶乘
 *
 * How To Read It??
 *
 * 4023872600770937735437024339230039857193748642107146325437999104299385123986290
 * 2059204420848696940480047998861019719605863166687299480855890132382966994459099
 * 7424504087073759918823627727188732519779505950995276120874975462497043601418278
 * 0946464962910563938874378864873371191810458257836478499770124766328898359557354
 * 3251318532395846307555740911426241747434934755342864657661166779739666882029120
 * 7379143853719588249808126867838374559731746136085379534524221586593201928090878
 * 2973084313928444032812315586110369768013573042161687476096758713483120254785893
 * 2076716913244842623613141250878020800026168315102734182797770478463586817016436
 * 5024153691398281264810213092761244896359928705114964975419909342221566832572080
 * 8213331861168115536158365469840467089756029009505376164758477284218896796462449
 * 4516076535340819890138544248798495995331910172335555660213945039973628075013783
 * 7615307127761926849034352625200015888535147331611702103968175921510907788019393
 * 1781141945452572238655414610628921879602238389714760885062768629671466746975629
 * 1123408243920816015378088989396451826324367161676217916890977991190375403127462
 * 2289988005195444414282012187361745992642956581746628302955570299024324153181617
 * 2104658320367869061172601587835207515162842255402651704833042261439742869330616
 * 9089796848259012545832716822645806652676995865268227280707578139185817888965220
 * 8164348344825993266043367660176999612831860788386150279465955131156552036093988
 * 1806121385586003014356945272242063446317974605946825731037900840244324384656572
 * 4501440282188525247093519062092902313649327349756551395872055965422874977401141
 * 3346962715422845862377387538230483865688976461927383814900140767310446640259899
 * 4902222217659043399018860185665264850617997023561938970178600408118897299183110
 * 2117122984590164192106888438712185564612496079872290851929681937238864261483965
 * 7382291123125024186649353143970137428531926649875337218940694281434118520158014
 * 1233448280150513996942901534830776445690990731524332782882698646027898643211390
 * 8350621709500259738986355427719674282224875758676575234422020757363056949882508
 * 7968928162753848863396909959826280956121450994871701244516461260379029309120889
 * 0869420285106401821543994571568059418727489980942547421735824010636774045957417
 * 8516082923013535808184009699637252423056085590370062427124341690900415369010593
 * 3983835777939410970027753472000000000000000000000000000000000000000000000000000
 * 0000000000000000000000000000000000000000000000000000000000000000000000000000000
 * 0000000000000000000000000000000000000000000000000000000000000000000000000000000
 * 0000000000000000000000000000000000000000
 */
public class Question6 {
    private static BigInteger result;
    public static void main(String[] args)throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int intValue = Integer.parseInt(buffer.readLine());
        BigInteger n = BigInteger.valueOf(1);
        for(int i = 2;i <= intValue;i++){
            n = n.multiply(BigInteger.valueOf(i));
//            System.out.println(n);
        }
        System.out.println(n);
    }
}
