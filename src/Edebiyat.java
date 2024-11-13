import java.util.*;

public class Edebiyat {

    public static int total = 0;
    public static List<Integer> wrongQuest = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Runnable> sorular = Arrays.asList(
                () -> soru1(sc, 'a'),
                () -> soru2(sc, 'b'),
                () -> soru3(sc, 'c'),
                () -> soru4(sc, 'e'),
                () -> soru5(sc, 'c'),
                () -> soru6(sc, 'd'),
                () -> soru7(sc, 'a'),
                () -> soru8(sc, 'e'),
                () -> soru9(sc, 'a'),
                () -> soru10(sc, 'e'),
                () -> soru11(sc, 'a'),
                () -> soru12(sc, 'b'),
                () -> soru13(sc, 'b'),
                () -> soru14(sc, 'c'),
                () -> soru15(sc, 'd'),
                () -> soru16(sc, 'a'),
                () -> soru17(sc, 'd'),
                () -> soru18(sc, 'e'),
                () -> soru19(sc, 'c'),
                () -> soru20(sc, 'c'),
                () -> soru21(sc, 'd'),
                () -> soru22(sc, 'b'),
                () -> soru23(sc, 'b'),
                () -> soru24(sc, 'e'),
                () -> soru25(sc, 'a'),
                () -> soru26(sc, 'd'),
                () -> soru27(sc, 'b'),
                () -> soru28(sc, 'a'),
                () -> soru29(sc, 'd'),
                () -> soru30(sc, 'b'),
                () -> soru31(sc, 'd'),
                () -> soru32(sc, 'e'),
                () -> soru33(sc, 'c'),
                () -> soru34(sc, 'c'),
                () -> soru35(sc, 'd'),
                () -> soru36(sc, 'e'),
                () -> soru37(sc, 'a'),
                () -> soru38(sc, 'e'),
                () -> soru39(sc, 'c'),
                () -> soru40(sc, 'c'),
                () -> soru41(sc, 'a'),
                () -> soru42(sc, 'c'),
                () -> soru43(sc, 'b'),
                () -> soru44(sc, 'b'),
                () -> soru45(sc, 'a'),
                () -> soru46(sc, 'd'),
                () -> soru47(sc, 'b'),
                () -> soru48(sc, 'c'),
                () -> soru49(sc, 'e'),
                () -> soru50(sc, 'd'),
                () -> soru51(sc, 'b'),
                () -> soru52(sc, 'd'),
                () -> soru53(sc, 'e'),
                () -> soru54(sc, 'b'),
                () -> soru55(sc, 'b'),
                () -> soru56(sc, 'a'),
                () -> soru57(sc, 'c'),
                () -> soru58(sc, 'e'),
                () -> soru59(sc, 'b'),
                () -> soru60(sc, 'e'),
                () -> soru61(sc, 'b'),
                () -> soru62(sc, 'b'),
                () -> soru63(sc, 'a'),
                () -> soru64(sc, 'b'),
                () -> soru65(sc, 'b'),
                () -> soru66(sc, 'd'),
                () -> soru67(sc, 'a'),
                () -> soru68(sc, 'b'),
                () -> soru69(sc, 'd'),
                () -> soru70(sc, 'b'),
                () -> soru71(sc, 'd'),
                () -> soru72(sc, 'c'),
                () -> soru73(sc, 'c'),
                () -> soru74(sc, 'a'),
                () -> soru75(sc, 'b'),
                () -> soru76(sc, 'd'),
                () -> soru77(sc, 'a'),
                () -> soru78(sc, 'a'),
                () -> soru79(sc, 'c'),
                () -> soru80(sc, 'b'),
                () -> soru81(sc, 'd'),
                () -> soru82(sc, 'a'),
                () -> soru83(sc, 'd'),
                () -> soru84(sc, 'b'),
                () -> soru85(sc, 'c'),
                () -> soru86(sc, 'e'),
                () -> soru87(sc, 'd'),
                () -> soru88(sc, 'c')
        );

        Collections.shuffle(sorular);

        for (Runnable soru : sorular) {
            soru.run();
        }
        if (!wrongQuest.isEmpty()) {
            System.out.println("\033[31m" + "Yanlış cevaplanan sorular tekrar edilecek!");
            List<Integer> questCopy = new ArrayList<>(wrongQuest);
            for (int i : questCopy) {
                switch (i) {
                    case 1: soru1(sc, 'a'); break;
                    case 2: soru2(sc, 'b'); break;
                    case 3: soru3(sc, 'c'); break;
                    case 4: soru4(sc, 'e'); break;
                    case 5: soru5(sc, 'c'); break;
                    case 6: soru6(sc, 'd'); break;
                    case 7: soru7(sc, 'a'); break;
                    case 8: soru8(sc, 'e'); break;
                    case 9: soru9(sc, 'a'); break;
                    case 10: soru10(sc, 'e'); break;
                    case 11: soru11(sc, 'a'); break;
                    case 12: soru12(sc, 'b'); break;
                    case 13: soru13(sc, 'b'); break;
                    case 14: soru14(sc, 'c'); break;
                    case 15: soru15(sc, 'd'); break;
                    case 16: soru16(sc, 'a'); break;
                    case 17: soru17(sc, 'd'); break;
                    case 18: soru18(sc, 'e'); break;
                    case 19: soru19(sc, 'c'); break;
                    case 20: soru20(sc, 'c'); break;
                    case 21: soru21(sc, 'd'); break;
                    case 22: soru22(sc, 'b'); break;
                    case 23: soru23(sc, 'b'); break;
                    case 24: soru24(sc, 'e'); break;
                    case 25: soru25(sc, 'a'); break;
                    case 26: soru26(sc, 'd'); break;
                    case 27: soru27(sc, 'b'); break;
                    case 28: soru28(sc, 'a'); break;
                    case 29: soru29(sc, 'd'); break;
                    case 30: soru30(sc, 'b'); break;
                    case 31: soru31(sc, 'd'); break;
                    case 32: soru32(sc, 'e'); break;
                    case 33: soru33(sc, 'c'); break;
                    case 34: soru34(sc, 'c'); break;
                    case 35: soru35(sc, 'd'); break;
                    case 36: soru36(sc, 'e'); break;
                    case 37: soru37(sc, 'a'); break;
                    case 38: soru38(sc, 'e'); break;
                    case 39: soru39(sc, 'c'); break;
                    case 40: soru40(sc, 'c'); break;
                    case 41: soru41(sc, 'a'); break;
                    case 42: soru42(sc, 'c'); break;
                    case 43: soru43(sc, 'b'); break;
                    case 44: soru44(sc, 'b'); break;
                    case 45: soru45(sc, 'a'); break;
                    case 46: soru46(sc, 'd'); break;
                    case 47: soru47(sc, 'b'); break;
                    case 48: soru48(sc, 'c'); break;
                    case 49: soru49(sc, 'e'); break;
                    case 50: soru50(sc, 'd'); break;
                    case 51: soru51(sc, 'b'); break;
                    case 52: soru52(sc, 'd'); break;
                    case 53: soru53(sc, 'e'); break;
                    case 54: soru54(sc, 'b'); break;
                    case 55: soru55(sc, 'b'); break;
                    case 56: soru56(sc, 'a'); break;
                    case 57: soru57(sc, 'c'); break;
                    case 58: soru58(sc, 'e'); break;
                    case 59: soru59(sc, 'b'); break;
                    case 60: soru60(sc, 'e'); break;
                    case 61: soru61(sc, 'b'); break;
                    case 62: soru62(sc, 'b'); break;
                    case 63: soru63(sc, 'a'); break;
                    case 64: soru64(sc, 'b'); break;
                    case 65: soru65(sc, 'b'); break;
                    case 66: soru66(sc, 'd'); break;
                    case 67: soru67(sc, 'a'); break;
                    case 68: soru68(sc, 'b'); break;
                    case 69: soru69(sc, 'd'); break;
                    case 70: soru70(sc, 'b'); break;
                    case 71: soru71(sc, 'd'); break;
                    case 72: soru72(sc, 'c'); break;
                    case 73: soru73(sc, 'c'); break;
                    case 74: soru74(sc, 'a'); break;
                    case 75: soru75(sc, 'b'); break;
                    case 76: soru76(sc, 'd'); break;
                    case 77: soru77(sc, 'a'); break;
                    case 78: soru78(sc, 'a'); break;
                    case 79: soru79(sc, 'c'); break;
                    case 80: soru80(sc, 'b'); break;
                    case 81: soru81(sc, 'd'); break;
                    case 82: soru82(sc, 'a'); break;
                    case 83: soru83(sc, 'd'); break;
                    case 84: soru84(sc, 'b'); break;
                    case 85: soru85(sc, 'c'); break;
                    case 86: soru86(sc, 'e'); break;
                    case 87: soru87(sc, 'd'); break;
                    case 88: soru88(sc, 'c'); break;
                }
            }
        } else {
            System.out.println("\033[32m" + "Tüm sorular doğru cevaplandı!");
        }
        System.out.println("88 sorudan " + total + " doğrunuz var.");
    }

    public static void soru1(Scanner sc, char answer) {
        System.out.println("\033[35m" + "1. Aşağıda verilen şıklardan hangisinde noktanın (.) kullanımı ile ilgili bir hata yapılmıştır?");
        System.out.println("a. Canlıların D.N.A.’sını da keşfettiklerine bakılırsa kısa zamanda çok sayıda hastalığın tedavisini de bulurlar; fakat bu kez de yeni problemler görülmeye başlar.");
        System.out.println("b. Stadyumda 1, 2 ve 3. olan sporcuları ödüllendirmek amacıyla çeşitli hediyeler takdim edildi.");
        System.out.println("c. Mustafa Kemal, 19.05.1919 tarihinde Samsun’a çıkmış ve Millî Mücadele’yi başlatan mücadele ateşinin fitilini yakmıştır.");
        System.out.println("d. Gönlümü almak için bana devamlı tekrar ettiğin hani o “Sensiz asla hayatta kalamam. Ölürüm.” deyişlerin yalan mıydı?");
        System.out.println("e. Bugün 30 Aralık. Soğuklar, olabildiğince bastırdı. Her yer buz gibi. Acilen ya eve, ya da sıcak bir yere sığınmalı.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(1);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru2(Scanner sc, char answer) {
        System.out.println("\033[34m" + "2. Türkiye, adeta bir turizm cennetidir. Hangi yerini anlatsam bilmem ki: Marmaris, Fethiye, Kapadokya, Denizli, Alanya, Konya, Adıyaman ( )");
        System.out.println("Yukarıdaki cümlede ayraçla belirtilen yere hangi noktalama işareti konmalıdır?");
        System.out.println("a. Kısa çizgi");
        System.out.println("b. Üç nokta");
        System.out.println("c. Noktalı virgül");
        System.out.println("d. İki nokta");
        System.out.println("e. Ünlem");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(2);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru3(Scanner sc, char answer) {
        System.out.println("\033[35m" + "3. Aşağıda verilen şıklardan hangisinde soru işareti (?) kullanımıyla ilgili bir hata yapılmıştır?");
        System.out.println("a. Ne demek istiyorsun, sen o gün ne yaptığını bilmiyor muydun?");
        System.out.println("b. Uzun geçen yılların ardından rastlaşmış bile olsak, adam çocukluk arkadaşına bu şekilde mi davranır Allah aşkına?");
        System.out.println("c. Avuçlarım şekerlerle dolu bir vaziyette heyecanla merdivenlerden inerken aniden ayağım kayıp aşağıya yuvarlanmaz mıyım, hem planlarım alt üst oldu, hem de ayağımı incittim?");
        System.out.println("d. Arkadaşım, sence de böyle yaparak çocukça davranmış olmuyor musun? Ne dersin?");
        System.out.println("e. Bunca zamandır hiç arayıp sormadı, bir selam yollamadı; şimdi işi düşünce de hiçbir şey yokmuş gibi aniden çıkagelmez mi?");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(3);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru4(Scanner sc, char answer) {
        System.out.println("\033[34m" + "4. Aşağıda verilen şıklardan hangisinde parantez ( ) kullanımıyla ilgili bir yanlışlık yapılmıştır?");
        System.out.println("a. Orhan Gazi, babası Osman Bey’in arzuladığı gibi, Bursa’yı 1326’da (H 726) fethetmiştir.");
        System.out.println("b. Dilimizde edebiyat teriminin karşılığı olarak aynı zamanda yazın (yazılı olan şeyler) kavramı da kullanılmaktadır.");
        System.out.println("c. Hayatım boyunca şu üç şeyden asla hoşnut olmadım: 1) iftira, 2) gıybet, 3) atalet.");
        System.out.println("d. Yunus Emre’nin, 1238’de (?) Sivrihisar’da dünyaya geldiği ve 1328’de Mihalıççık’ta hayata gözlerini yumduğu düşünülmektedir.");
        System.out.println("e. Metafor çeşitleri arasında şairane metafor (‘Ağır ağır çıkacaksın bu merdivenlerden’ [Haşim]) türü de yer almaktadır.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(4);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru5(Scanner sc, char answer) {
        System.out.println("\033[35m" + "5. Aşağıdaki verilen tümcelerin hangisinde kesme işareti (’) hatalı kullanılmıştır?");
        System.out.println("a. Sen ona “Al bu parayı bozdur!” dediysen, 0,50’lik, 0,10’luk mu yaptırır insan?");
        System.out.println("b. Biruni’de okuyan öğrenciler, Üniversite’nin sağladığı olanaklar sebebiyle diğer yerlere göre daha konforlu bir eğitim imkanına sahiptirler");
        System.out.println("c. Çok sayıda büyük şehirde görüldüğü üzere, Bursa’da da gerçek Bursa’lı maalesef çok az kaldı.");
        System.out.println("d. Bence, Uşaklıgil’in Aşk-ı Memnu’su, Türk edebiyatının klâsiği sayılabilecek nitelikte bir romandır.");
        System.out.println("e. Evdekileri zar zor almaya ikna ettiğim kedim Minnoş’u, neredeyse odasından hiç çıkmamasına rağmen, nedense ablam bir türlü sevemedi.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(5);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru6(Scanner sc, char answer) {
        System.out.println("\033[34m" + "6. İnsan bir belediye otobüsünde ayakta, saatlerce yolculuk etti mi sırtı öyle bir tutuluyor ki sorma gitsin() ");
        System.out.println("Yukarıdaki tümcede parantezle gösterilen yere hangi noktalama işareti getirilmelidir?");
        System.out.println("a. Kısa çizgi");
        System.out.println("b. Noktalı virgül");
        System.out.println("c. İki nokta");
        System.out.println("d. Ünlem");
        System.out.println("e. Soru ");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(6);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru7(Scanner sc, char answer) {
        System.out.println("\033[35m" + "7. Gerçekte söylenenen bir sözün karşıt anlamını göstermek amacıyla sözcüğün sonuna aşağıdaki noktalama işaretlerinden hangisi getirilmelidir?");
        System.out.println("a. Parantez içinde ünlem");
        System.out.println("b. Parantez içinde nokta");
        System.out.println("c. Parantez içinde soru ");
        System.out.println("d. Parantez içinde kesme");
        System.out.println("e. Parantez içinde üç nokta");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(7);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru8(Scanner sc, char answer) {
        System.out.println("\033[34m" + "8. Aşağıda eğik çizginin kullanımıyla ilgili verilen bilgilerden hangisi yanlıştır?");
        System.out.println("a. Düz yazıda yapılan şiir alıntılarında mısraları birbirinden ayırmak için kullanılır.");
        System.out.println("b. Özellikle bilimsel yazılarda veya hem o hem bu bağlaçlarının yerine kullanılır.");
        System.out.println("c. Dil bilgisi çalışmalarında eklerin farklı biçimlerini gösterirken kullanılır.");
        System.out.println("d. Matematikte bölme işareti olarak da kullanılır.");
        System.out.println("e. Bilimsel yazıların kaynakçalarında makale adları eğik çizgi ile ayrılır.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(8);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru9(Scanner sc, char answer) {
        System.out.println("\033[35m" + "9. Uzun çizginin kullanımıyla ilgili aşağıda verilen şıklardan hangisi doğrudur?");
        System.out.println("a. Karşılıklı konuşmada, konuşan değiştikçe sözlerin başına konulur.");
        System.out.println("b. Arasözleri, aracümleleri, ayrıntı sayabilecek açıklamaları belirtmek için kullanılır.");
        System.out.println("c. Satır sonuna sığmayan sözcükleri, kurallı bir şekilde ayırmak için kullanılır.");
        System.out.println("d. Kelimeleri hecelere ayırmak için kullanılır.");
        System.out.println("e. Birbiriyle ilgili tarih, sayı veya isimler arasında kullanılır.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(9);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru10(Scanner sc, char answer) {
        System.out.println("\033[34m" + "10. İki nokta işaretinin kullanımıyla ilgili aşağıda verilen şıklardan hangisi yanlıştır?");
        System.out.println("a. Başka bir kaynaktan alınan yazı ya da sözlerde, tırnak işaretinden ya da konuşma çizgisinden önce konulur ve örnekler büyük harfle başlar.");
        System.out.println("b. Bir cümleden ya da kelimeden sonra örnekler ve açıklamalar sıralandığında konulur.");
        System.out.println("c. Cümlelerde tırnak içine alınmış alıntı cümlelerden önce konulur.");
        System.out.println("d. Bir konunun maddelerini ve çeşitlerini sıralamadan önce kullanılır.");
        System.out.println("e. Birbirine bağlı ama her biri kendi içinde bağımsız cümleleri ayırmak için kullanılır.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(10);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru11(Scanner sc, char answer) {
        System.out.println("\033[35m" + "11. Cumhuriyet döneminde Latin alfabesine geçişle ilgili yapılan çalışmalar sonucunda ……………. tarihinde Latin alfabesi temelindeki Türk alfabesi kabul edilmiş ve Resmi Gazete'de yayımlanarak yürürlüğe girmiştir.");
        System.out.println("Yukarıdaki boşluğa hangi tarih getirilmelidir?");
        System.out.println("a. 1 Kasım 1928");
        System.out.println("b. 1 Kasım 1932");
        System.out.println("c. 1 Kasım 1938");
        System.out.println("d. 1 Kasım 1924");
        System.out.println("e. 10 Kasım 1926");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(11);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru12(Scanner sc, char answer) {
        System.out.println("\033[34m" + "12. Aşağıdakilerin hangisinde büyük harf kullanılmamasından kaynaklanan yazım yanlışı bulunmaktadır?");
        System.out.println("a. Ege sahillerimiz yine her yaz olduğu gibi Ukraynalı, Rus ve Alman turistlerle dolup taşıyor.");
        System.out.println("b. Türk ulusu Millî mücadele yıllarında yedi cihana karşı büyük mücadeleler vermiş ve bunda da muzaffer olmuştur.");
        System.out.println("c. Minikler, okula nereden geldiği belli olmayan yavru köpeğe bayılmış, hatta ona Boncuk diye isim koymuşlardı.");
        System.out.println("d. 23 Nisan 1920 ulu önder Atatürk’ün çocuklara bayram olarak armağan ettiği tarihtir.");
        System.out.println("e. Türkiye Büyük Millet Meclisine teklif edilen yasalar kabul edildiğinde, Anayasa Mahkemesi tarafından Anayasa’ya uygunluk açısından denetlenebilir.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(12);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru13(Scanner sc, char answer) {
        System.out.println("\033[35m" + "13. Aşağıdakilerin hangisinde pekiştirme sıfatının yazımı ile ilgili bir yanlış yapılmıştır?");
        System.out.println("a. Bütün gün uğraşıp didindim; fakat henüz bir netice elde edemedim.");
        System.out.println("b. Ben bütün elbiselerimi seviyorum. Özellikle pes pembe güllü olanın benim için yeri daha da başkadır.");
        System.out.println("c. Fırtınadan dolayı bataklığa dönen caddelerde ceketim battı.");
        System.out.println("d. Sınıftan çıkar çıkmaz dışarıdaki öğrencilerin inceleyici bakışlarıyla karşılaşmak hoş değil.");
        System.out.println("e. Yapılacak listesi böylesine uzamış iken ikide bir gezmelere gitmek de neyin nesi?");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(13);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru14(Scanner sc, char answer) {
        System.out.println("\033[34m" + "14. Aşağıdakilerin hangisinde “ki”nin kullanımı ile ilgili bir yanlış yapılmıştır?");
        System.out.println("a. Aniden gitmen gerekti, anladık; ne var ki biz de saatlerdir seni beklemekten bitap düştük!");
        System.out.println("b. Mademki bu ödevlerin yarına kadar bitmesi gerekiyor, o halde hiçbirimize uyku yok!");
        System.out.println("c. Uçağın kalkacağı saat net, öyleyse neden geç kalıyorsunki?");
        System.out.println("d. Geçen geceki kötü vaziyeti öğrenince saatin geç olmasına aldırmadan yola çıkmış.");
        System.out.println("e. Tüm gün boşu boşuna bizi beklemişler, belki geliriz diye umutlanmışlar.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(14);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru15(Scanner sc, char answer) {
        System.out.println("\033[35m" + "15. Aşağıdakilerin hangisinde ki bağlacının yazımı ile ilgili bir yanlış yapılmıştır?");
        System.out.println("a. Nasreddin Hoca, bir de dönmüş bakmış ki arkasında kimse kalmamış.");
        System.out.println("b. Dünkü çocuk gelmiş, bugün bize iş öğretmeye kalkıyor?");
        System.out.println("c. Geçmişteki yanlışlardan ders çıkarılabiliyorsa, yaşananlar için müteessir olmaya lüzum yok.");
        System.out.println("d. Dostum, ayağını yorganına göre uzatki sonra sıkıntı çekmeyesin!");
        System.out.println("e. İçim öyle mutluluk dolu, kalbim öylesine kıpır kıpır ki sanki içimde bir kuş kanat çırpıyor.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(15);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru16(Scanner sc, char answer) {
        System.out.println("\033[34m" + "16. Dildeki başka seslerle kurduğu ilişki yönünden belirlenen ayırıcı özelliği bulunan ses öğesine ……………  denir.");
        System.out.println("a. Fonoloji");
        System.out.println("b. Sentaks");
        System.out.println("c. Etimoloji");
        System.out.println("d. Filoloji");
        System.out.println("e. Linguistik");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(16);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru17(Scanner sc, char answer) {
        System.out.println("\033[35m" + "17. Dilin özellikleriyle ilgili olarak verilenlerden hangisi yanlıştır?");
        System.out.println("a. Dil Doğal Bir Varlıktır");
        System.out.println("b. Dil Öğrenilen ve Edinilen Bir Yetenektir");
        System.out.println("c. Dil Tarihsel ve Süreklidir");
        System.out.println("d. Dil bireyseldir.");
        System.out.println("e. Dil değişkendir.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(17);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru18(Scanner sc, char answer) {
        System.out.println("\033[34m" + "18. Dünyadaki diller …………….. ve ……..  bakımından olmak üzere iki grupta incelenir.");
        System.out.println("Yukarıdaki boşluğa hangisi getirilmelidir?");
        System.out.println("a. Biçim ve Köken");
        System.out.println("b. Biçim ve İçerik");
        System.out.println("c. Yapı ve İnşa");
        System.out.println("d. Durum ve Eylem");
        System.out.println("e. Yapı ve Köken");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(18);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru19(Scanner sc, char answer) {
        System.out.println("\033[35m" + "19. Aşağıdaki dillerden hangisi köken bakımından Hami-Sami dil ailesine mensuptur?");
        System.out.println("a. Çince");
        System.out.println("b. Hintçe");
        System.out.println("c. Arapça");
        System.out.println("d. Farsça");
        System.out.println("e. Fransızca");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(19);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru20(Scanner sc, char answer) {
        System.out.println("\033[34m" + "20. Aşağıda verilen dillerden hangileri köken bakımından Hami- Sami dil ailesine mensuptur?");
        System.out.println("a. Arapça-Farsça");
        System.out.println("b. Çince-Tibetçe");
        System.out.println("c. İbranice- Arapça");
        System.out.println("d. Fransızca- Almanca");
        System.out.println("e. Rusça- Sırpça");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(20);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru21(Scanner sc, char answer) {
        System.out.println("\033[35m" + "21. “Yunanca” köken bakımından hangi dil ailesine mensuptur?");
        System.out.println("a. Ural-Altay");
        System.out.println("b. Hami-Sami");
        System.out.println("c. Çin-Tibet");
        System.out.println("d. Hint-Avrupa");
        System.out.println("e. Kafkas Dil Ailesi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(21);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru22(Scanner sc, char answer) {
        System.out.println("\033[34m" + "22. Aşağıda verilen dillerden hangisi köken bakımından Hint-Avrupa dil ailesinin Avrupa koluna mensup değildir?");
        System.out.println("a. Germen dilleri");
        System.out.println("b. Eski Anadolu dilleri");
        System.out.println("c. Latin dilleri");
        System.out.println("d. Slav dilleri");
        System.out.println("e. Baltık dilleri");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(22);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru23(Scanner sc, char answer) {
        System.out.println("\033[35m" + "23. Eski Mısır dili köken bakımından hangi dil ailesine mensuptur?");
        System.out.println("a. Ural-Altay Dil Ailesi");
        System.out.println("b. Hami-Sami Dil Ailesi");
        System.out.println("c. Çin-Tibet Dil Ailesi");
        System.out.println("d. Hint-Avrupa Dil Ailesi");
        System.out.println("e. Kafkas Dil Ailesi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(23);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru24(Scanner sc, char answer) {
        System.out.println("\033[34m" + "24. Aşağıda verilen dillerden hangisi köken bakımından Ural-Altay dil ailesinin Ural koluna mensuptur?");
        System.out.println("a. Türkçe");
        System.out.println("b. Moğolca");
        System.out.println("c. Mançuca");
        System.out.println("d. Tunguzca");
        System.out.println("e. Fince");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(24);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru25(Scanner sc, char answer) {
        System.out.println("\033[35m" + "25. Aşağıda verilen dillerden hangisi köken bakımından Ural-Altay dil ailesinin Altay koluna mensuptur?");
        System.out.println("a. Moğolca");
        System.out.println("b. Macarca");
        System.out.println("c. Fince");
        System.out.println("d. Samoyedce");
        System.out.println("e. Estonca");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(25);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru26(Scanner sc, char answer) {
        System.out.println("\033[34m" + "26. ……. dili ve …… dilinin de Altay grubuna dahil olduğu da bilim çevrelerinde kabul görmektedir.");
        System.out.println("Samuel Martin ve Miller'ın 1960'lardan sonraki çalışmaları sonucunda bu diller Altay dilleri arasında gösterilir.");
        System.out.println("a. Macar-Fin");
        System.out.println("b. Estonya-Fin");
        System.out.println("c. Türk-Moğol");
        System.out.println("d. Kore-Japon");
        System.out.println("e. Mançu-Tunguz");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(26);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru27(Scanner sc, char answer) {
        System.out.println("\033[35m" + "27. Ural - Altay Dil Ailesi (……. olarak da bilinir), 19. yüzyılda ve bazı ülkelerde 20. yy ortalarına kadar yaygın biçimde kabul edilen, Ural ve Altay dillerini bir arada toplayan hipotezdir.");
        System.out.println("a. Altayca");
        System.out.println("b. Turanca");
        System.out.println("c. Sibirce");
        System.out.println("d. Uralca");
        System.out.println("e. Çuvaşça");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(27);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru28(Scanner sc, char answer) {
        System.out.println("\033[34m" + "28. Türkçe köken bakımından aşağıdaki dil gruplarından hangisine dâhil edilmektedir?");
        System.out.println("a. Ural-Altay Dil Ailesi");
        System.out.println("b. Hami-Sami Dil Ailesi");
        System.out.println("c. Çin-Tibet Dilleri");
        System.out.println("d. Bantu Dilleri");
        System.out.println("e. Hint-Avrupa Dil Ailesi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(28);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru29(Scanner sc, char answer) {
        System.out.println("\033[35m" + "29. Aşağıdaki dillerden hangisi Ural-Altay dillerinden biri değildir?");
        System.out.println("a. Fince");
        System.out.println("b. Estonca");
        System.out.println("c. Macarca");
        System.out.println("d. İsveççe");
        System.out.println("e. Samoyedce");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(29);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru30(Scanner sc, char answer) {
        System.out.println("\033[34m" + "30. Aşağıdaki dil özelliklerinden hangisi Ural-Altay dillerinin ortak yönlerinden biri değildir?");
        System.out.println("a. Bu dillerdeki sözcüklerde cinsiyet ayrımı yoktur.");
        System.out.println("b. Sayılardan sonra çokluk eki kullanılır.");
        System.out.println("c. Bağlar yerine eylem biçimleri kullanılır.");
        System.out.println("d. Soru eki bulunmaktadır.");
        System.out.println("e. Ad çekimlerinde iyelik ekleri kullanılır.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(30);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru31(Scanner sc, char answer) {
        System.out.println("\033[35m" + "31. Aşağıda verilenlerden hangisi Türk dilinin tarihsel gelişim dönemlerinden birine ait değildir?");
        System.out.println("a. Yeni Türkçe Dönemi");
        System.out.println("b. İlk Türkçe Dönemi");
        System.out.println("c. Eski Türkçe Dönemi");
        System.out.println("d. Fin-İgor Dil Birliği Dönemi");
        System.out.println("e. Altay Dil Birliği Dönemi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(31);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru32(Scanner sc, char answer) {
        System.out.println("\033[34m" + "32. Aşağıda verilenlerden hangisi Orta Türkçe Dönemi’nde görülen yazı dillerinden biri değildir?");
        System.out.println("a) Karahanlı Türkçesi");
        System.out.println("b) Harezm Türkçesi");
        System.out.println("c) Kıpçak Türkçesi");
        System.out.println("d) Eski AnadoluTürkçesi");
        System.out.println("e) Uygur Türkçesi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(32);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru33(Scanner sc, char answer) {
        System.out.println("\033[35m" + "33. Aşağıda verilen eserlerden hangisi Karahanlı Türkçesi Dönemi’ne ait değildir?");
        System.out.println("a. Dîvânü Lûgati’t-Türk");
        System.out.println("b. Kutadgu Bilig");
        System.out.println("c. Mu’inü’l Mürîd");
        System.out.println("d. Atebetü’l-Hakayık");
        System.out.println("e. Dîvân-ı Hikmet");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(33);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru34(Scanner sc, char answer) {
        System.out.println("\033[34m" + "34. Aşağıda verilen eserlerden hangisinin yazarı yanlış verilmiştir?");
        System.out.println("a. Kutadgu Bilig: Balasagunlu Yusuf Has Hacip");
        System.out.println("b. Atebetü’l-Hakayık: Edip Ahmed Yükneki");
        System.out.println("c. Dîvân-ı Hikmet: Zemahşerî");
        System.out.println("d. Nehcü’l Feradis: Kerderli Mahmud");
        System.out.println("e. Kısasü’l Enbiya: Rabguzî");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(34);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru35(Scanner sc, char answer) {
        System.out.println("\033[35m" + "35. Aşağıda verilen eserlerden hangisinin yazarı yanlış verilmiştir?");
        System.out.println("a. Nehcü’l Feradis: Kerderli Mahmud");
        System.out.println("b. Kısasü’l Enbiya: Rabguzî");
        System.out.println("c. Mukaddimetü’l Edeb: Zemahşerî");
        System.out.println("d. Mu’inü’l Mürîd: Harezmli Kutb");
        System.out.println("e. Muhabbetname: Muhammed Hoca Big");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(35);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    public static void soru36(Scanner sc, char answer) {
        System.out.println("\033[34m" + "36. Erik ( ) çilek ve kiraz bahar ( ) nar ( ) elma ve armut güz meyveleridir ( )");
        System.out.println("a) ( , ), ( : ), ( ! ), ( . )");
        System.out.println("b) ( , ), ( ; ), ( ! ), ( . )");
        System.out.println("c) ( , ), ( : ), ( . ), ( : )");
        System.out.println("d) ( , ), ( ; ), ( . ), ( . )");
        System.out.println("e) ( , ), ( ; ), ( , ), ( . )");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(36);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 37. soru
    public static void soru37(Scanner sc, char answer) {
        System.out.println("\033[35m" + "( ) Buğdayla arpadan başka ne biter bu topraklarda ( ) Ziraatçı sayar ( ) ( ) Yulaf ( ) pancar ( ) zerzevat ( ) tütün ( ) 37. Parantezlere hangi noktalama işaretleri konur?");
        System.out.println("a) (-) (?) (:) (-) (,) (,) (,) (...)");
        System.out.println("b) (-) (...) (:) (-) (,) (,) (,) (...)");
        System.out.println("c) (“) (?) (;) (-) (,) (,) (,) (...)");
        System.out.println("d) (“) (?) (“) (-) (,) (,) (,) (...)");
        System.out.println("e) (-) (?) (;) (-) (,) (,) (,) (.)");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(37);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 38. soru
    public static void soru38(Scanner sc, char answer) {
        System.out.println("\033[34m" + "38. Aşağıdaki cümlelerin hangisinde bir yazım yanlışı vardır?");
        System.out.println("a) Dünya, Güneş’in çevresinde döner.");
        System.out.println("b) Güneş girmeyen eve doktor girer.");
        System.out.println("c) Bu gece ay hepimizi büyüledi.");
        System.out.println("d) O kadının dünyada bir eşi yoktur.");
        System.out.println("e) Ay dünyanın uydusudur.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(38);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 39. soru
    public static void soru39(Scanner sc, char answer) {
        System.out.println("\033[35m" + "39. Aşağıdakilerden hangisinde sayıların yazımıyla ilgili bir yanlışlık yapılmıştır?");
        System.out.println("a) Saatte 180 km. hızla gidiyordu.");
        System.out.println("b) 20. yüzyıl bir bunalım yüzyılı oldu.");
        System.out.println("c) Aradan onbeş yıl geçmişti.");
        System.out.println("d) Beni üç beş gün sonra arayabilirsin.");
        System.out.println("e) 8.30 vapurunu kaçırmayalım.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(39);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 40. soru
    public static void soru40(Scanner sc, char answer) {
        System.out.println("\033[34m" + "40. Türkçe köken bakımından………..…’ndadır; yapı bakımından …….……….bir dildir.");
        System.out.println("a) Hint-Avrupa dil ailesinin Avrupa kolu-çekimli");
        System.out.println("b) Hami-Sami dil ailesinin Sami kolu-eklemeli");
        System.out.println("c) Ural-Altay dil ailesinin Altay kolu-eklemeli");
        System.out.println("d) Hint-Avrupa dil ailesinin Hint kolu-tek heceli");
        System.out.println("e) Ural-Altay dil ailesinin Ural kolu-çekimli");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(40);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 41. soru
    public static void soru41(Scanner sc, char answer) {
        System.out.println("\033[35m" + "41. Aşağıdakilerden hangisi Orta Türkçe (Karahanlı Türkçesi) Dönemi eserlerinden değildir?");
        System.out.println("a) Irk Bitig");
        System.out.println("b) Dîvân-ı Hikmet");
        System.out.println("c) Atebetü’l- Hakâyık");
        System.out.println("d) Dîvânü Lugâti’t-Türk");
        System.out.println("e) Kutadgu Bilig");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(41);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 42. soru
    public static void soru42(Scanner sc, char answer) {
        System.out.println("\033[34m" + "42. 14. yüzyılda derleme yoluyla yazılmış iki bölümlük bir eserdir. İtalyan ve Almanların derlediği bu eser, Kıpçakların konuşma dilini temsil eder.");
        System.out.println("Sözlüğün İtalyan ve Alman olmak üzere iki bölümü vardır. İtalyanca bölümde, Latince – Farsça – Kıpçakça bir sözlük; Alman bölümünde ise Kıpçakça – Almanca ve Kıpçakça – Latince sözlükler vardır. Ayrıca ilahiler, atasözleri ve bilmeceler gibi metinler de içermektedir.");
        System.out.println("Hangi esere aittir?");
        System.out.println("a) Mecalisü’n-Nefâis");
        System.out.println("b) Babürname");
        System.out.println("c) Codex Cumanicus");
        System.out.println("d) Muhabbetnâme");
        System.out.println("e) Nehcü’l-Feradis");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(42);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 43. soru
    public static void soru43(Scanner sc, char answer) {
        System.out.println("\033[35m" + "43. 1312 yılında Mısırda, Ebu Hayyan Muhammed bin Yusuf tarafından yazılmıştır. Eser; sözlük, yapı bilgisi ve cümle olmak üzere üç bölümden oluşur.");
        System.out.println("Eser üzerinde ilk önemli çalışmayı Prof. Dr. Ahmet Caferoğlu yapmıştır.");
        System.out.println("Hangi esere aittir?");
        System.out.println("a) Nehcü’l-Feradis");
        System.out.println("b) Kitâbü’l-İdrak li-Lisâni’l-Etrâk");
        System.out.println("c) Muhabbetnâme");
        System.out.println("d) Mecalisü’n-Nefâis");
        System.out.println("e) Babürname");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(43);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 44. soru
    public static void soru44(Scanner sc, char answer) {
        System.out.println("\033[34m" + "44. Aşağıda verilen eserlerden hangisinin yazarı yanlış verilmiştir?");
        System.out.println("a) Nehcü’l-Feradis: Kerderli Mahmud");
        System.out.println("b) Kitâbü’l-İdrak li-Lisâni’l-Etrâk: Rabguzî");
        System.out.println("c) Muhabbetnâme: Muhammed Hoca Big");
        System.out.println("d) Mecalisü’n-Nefâis: Ali Şir Nevâyî");
        System.out.println("e) Babürname: Babür Şah");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(44);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 45. soru
    public static void soru45(Scanner sc, char answer) {
        System.out.println("\033[35m" + "45. 15. yüzyılın başlarında yazıldığı tahmin edilen eser, Arapça – Türkçe bir sözlük ve gramer kitabıdır.");
        System.out.println("Eser, 3000 kelimelik bir Arapça - Türkçe sözlük ile yapı ve cümle bilgisi bölümlerini içeren gramer bölümünden oluşur.");
        System.out.println("Hangi esere aittir?");
        System.out.println("a) Et-Tuhfetü’z – Zekiyye fi’l – Lugati’t Türkiyye");
        System.out.println("b) Bülgatü’l – Müştak fi Lugati’t Türk ve’l Kıfçak");
        System.out.println("c) Ed- Dürretü’l- Mudiyye fi’l Lugati’i Türkiyye");
        System.out.println("d) Kitab-ı Mecmu-ı Tercüman-ı Türki ve Acemi ve Mugali");
        System.out.println("e) Kitabü’l – İdrak li-Lisani’l Etrak");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(45);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 46. soru
    public static void soru46(Scanner sc, char answer) {
        System.out.println("\033[34m" + "46. 1343 yılında Konyalı Halil bin Muhammed el-Konevi tarafından yazılmıştır.");
        System.out.println("Eser Arapça – Türkçe ve Moğolca – Farsça olmak üzere iki bölümden oluşur.");
        System.out.println("Hangi esere aittir?");
        System.out.println("a) Et-Tuhfetü’z – Zekiyye fi’l – Lugati’t Türkiyye");
        System.out.println("b) Bülgatü’l – Müştak fi Lugati’t Türk ve’l Kıfçak");
        System.out.println("c) Ed- Dürretü’l- Mudiyye fi’l Lugati’i Türkiyye");
        System.out.println("d) Kitab-ı Mecmu-ı Tercüman-ı Türki ve Acemi ve Mugali");
        System.out.println("e) Kitabü’l – İdrak li-Lisani’l Etrak");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(46);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 47. soru
    public static void soru47(Scanner sc, char answer) {
        System.out.println("\033[35m" + "47. Hazar Denizinin kuzeyinden batıya yayılan Türklerin konuştukları dil, Kuzey Türkçesidir.");
        System.out.println("Yayılma alanının tersine bu yazı diliyle oluşturulan eserler Mısır ve Suriye’de yazılmışlardır.");
        System.out.println("Aşağıdaki yazarlardan hangisi bu Türkçe ile eser ortaya koyan isimlerden biridir?");
        System.out.println("a) Ahmed Yesevî");
        System.out.println("b) Cemaleddin Ebu Muhammed Abdullah et-Türkî");
        System.out.println("c) Yusuf Has Hacib");
        System.out.println("d) Edib Ahmed Yüknekî");
        System.out.println("e) Mahmud el- Kaşgârî");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(47);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 48. soru
    public static void soru48(Scanner sc, char answer) {
        System.out.println("\033[34m" + "48. “Türk Dilinin Parlayan İncisi” olarak adını Türkiye Türkçesine çevirebileceğimiz eserin yazılış yeri ve yazarı bilinmemektedir.");
        System.out.println("Muhtevası, Arapça – Türkçe sözlük ve konuşma kılavuzundan oluşmaktadır.");
        System.out.println("Hangi esere aittir?");
        System.out.println("a) Et-Tuhfetü’z – Zekiyye fi’l – Lugati’t Türkiyye");
        System.out.println("b) Bülgatü’l – Müştak fi Lugati’t Türk ve’l Kıfçak");
        System.out.println("c) Ed- Dürretü’l- Mudiyye fi’l Lugati’i Türkiyye");
        System.out.println("d) Kitab-ı Mecmu-ı Tercüman-ı Türki ve Acemi ve Mugali");
        System.out.println("e) Kitabü’l – İdrak li-Lisani’l Etrak");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(48);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 49. soru
    public static void soru49(Scanner sc, char answer) {
        System.out.println("\033[35m" + "49. Farsça’dan tercüme edilmiş, atçılık ve veterinerlikle ilgili bir eserdir.");
        System.out.println("At hastalıklarını, tedavilerini ve at terbiyesini anlatır.");
        System.out.println("Hangi esere aittir?");
        System.out.println("a) İrşadü’l Müluk ve’s-Selatin");
        System.out.println("b) Gülistan Tercümesi");
        System.out.println("c) Baytaratü’l Vazıh");
        System.out.println("d) Münyetü’l Guzat");
        System.out.println("e) Kitabü’l Hayl");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(49);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 50. soru
    public static void soru50(Scanner sc, char answer) {
        System.out.println("\033[34m" + "50. Karahanlı ve Harazm Türkçelerinin devamı niteliğindedir. Çağatay Türkçesi adı ile de bilinir.");
        System.out.println("XV. yüzyıldan XIX. yüzyıla kadar Orta Asya Türk dünyasında Türk dilini temsil etmiştir.");
        System.out.println("Maveraünnehir, Horasan İdil Boyları, Hindistan, Volga, Kırım ve Türkistan’da yaşayan Türk boylarının edebiyat ve kültür dili olarak kullanılmıştır.");
        System.out.println("Hangi Türkçe için kullanılmıştır?");
        System.out.println("a) Kuzey Türkçesi");
        System.out.println("b) Batı Türkçesi");
        System.out.println("c) Güney Türkçesi");
        System.out.println("d) Doğu Türkçesi");
        System.out.println("e) Oğuz Türkçesi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(50);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 51. soru
    public static void soru51(Scanner sc, char answer) {
        System.out.println("\033[35m" + "51. ….. …………… Mecalisü’n Nefais, Muhakemetü’l Lugeteyn gibi büyük eserlerinin yanı sıra dört divan ve beş mesnevisi, Türkçenin Farsçadan daha üstün olduğunu dile getirdiği Muhakemetü’l – Lugateyn adlı eserleri vardır.");
        System.out.println("Yukarıda bahsi geçen eserler hangi yazara aittir?");
        System.out.println("a. Fuzuli");
        System.out.println("b. Ali Şir Nevâyî");
        System.out.println("c. Kaşgarlı Mahmud");
        System.out.println("d. Yusuf Has Hacib");
        System.out.println("e. Babür Şah");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(51);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 52. soru
    public static void soru52(Scanner sc, char answer) {
        System.out.println("\033[34m" + "52. ………. Türkçesi 13 – 15. yüzyıllar arasındaki Türkçeye verilen isimdir. Batı Türkçesinin ilk devresidir. Dil yapısı kendinden sonraki iki devreden oldukça farklıdır. ….. Türkçesi yabancı unsurlar bakımından en temiz devirdir. Bu devirde Türkçeye Farsça ve Arapça unsurlar yavaş yavaş girmeye başlamıştır. Yabancı unsurlar daha çok nazım dilinde görülür. Nesir dili ise çok temiz ve durudur.");
        System.out.println("Yukarıda bahsi geçen bilgiler hangi Türkçe için kullanılmıştır?");
        System.out.println("a. Harezm Türkçesi");
        System.out.println("b. Kıpçak Türkçesi");
        System.out.println("c. Çağatay Türkçesi");
        System.out.println("d. Eski Anadolu Türkçesi");
        System.out.println("e. Osmanlı Türkçesi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(52);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 53. soru
    public static void soru53(Scanner sc, char answer) {
        System.out.println("\033[35m" + "53. Batı Türkçesinin ikinci devresidir. 15. asrın sonlarından 20. asrın başlarına kadar devam etmiş bir yazı dilidir. Gramer şekilleri bakımından bu Türkçe ile Türkiye Türkçesi arasında belirli bir ayrılık yoktur. Türkçe bakımından ancak bu son iki devre ile Eski Anadolu Türkçesi arasında belirli ayrılıklar vardır. Eski Anadolu Türkçesi, Batı Türkçesinin eski gramer şekillerini içeren devredir.");
        System.out.println("Yukarıda bahsi geçen bilgiler hangi Türkçe için kullanılmıştır?");
        System.out.println("a. Harezm Türkçesi");
        System.out.println("b. Kıpçak Türkçesi");
        System.out.println("c. Çağatay Türkçesi");
        System.out.println("d. Eski Anadolu Türkçesi");
        System.out.println("e. Osmanlı Türkçesi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(53);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 54. soru
    public static void soru54(Scanner sc, char answer) {
        System.out.println("\033[34m" + "54. Batı Türkçesinin üçüncü devresidir. Bugün de devam etmekte olan bu devre, 1908 Meşrutiyeti ile başlar. Bu devrin Meşrutiyetten Cumhuriyete kadar olan ilk safhası bu Türkçenin başlangıç devri durumundadır ve bu kısa devirde Osmanlı Türkçesi yavaş yavaş varlığını yitirmektedir.");
        System.out.println("Yukarıda bahsi geçen bilgiler hangi Türkçe için kullanılmıştır?");
        System.out.println("a. Harezm Türkçesi");
        System.out.println("b. Türkiye Türkçesi");
        System.out.println("c. Çağatay Türkçesi");
        System.out.println("d. Eski Anadolu Türkçesi");
        System.out.println("e. Osmanlı Türkçesi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(54);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 55. soru
    public static void soru55(Scanner sc, char answer) {
        System.out.println("\033[35m" + "55. Bir dilin ses, şekil ve kelime yönünden büyük ayrılıklar gösteren en eskiden ayrılmış koluna ……… denir.");
        System.out.println("Yukarıdaki boşluğa hangi kavram getirilmelidir?");
        System.out.println("a. Şive");
        System.out.println("b. Lehçe");
        System.out.println("c. Ağız");
        System.out.println("d. Argo");
        System.out.println("e. Jargon");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(55);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 56. soru
    public static void soru56(Scanner sc, char answer) {
        System.out.println("\033[34m" + "56. Bir dilin bazı ses ve şekil ayrılıklarını gösteren ve o dilin bilinen tarihi gelişme zamanlarında ayrılmış koluna …… denir.");
        System.out.println("Yukarıdaki boşluğa hangi kavram getirilmelidir?");
        System.out.println("a. Şive");
        System.out.println("b. Lehçe");
        System.out.println("c. Ağız");
        System.out.println("d. Argo");
        System.out.println("e. Jargon");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(56);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 57. soru
    public static void soru57(Scanner sc, char answer) {
        System.out.println("\033[35m" + "57. Bir dilin yalnız sese dayalı olarak söyleyiş ve telaffuz ayrılıklarını gösteren duruma ….. denir.");
        System.out.println("Yukarıdaki boşluğa hangi kavram getirilmelidir?");
        System.out.println("a. Şive");
        System.out.println("b. Lehçe");
        System.out.println("c. Ağız");
        System.out.println("d. Argo");
        System.out.println("e. Jargon");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(57);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 58. soru
    public static void soru58(Scanner sc, char answer) {
        System.out.println("\033[34m" + "58. Türk dili; …….., …… ve Türkçe olmak üzere üç lehçeye ayrılmıştır.");
        System.out.println("Yukarıdaki boşluğa hangi Türk lehçeleri getirilmelidir?");
        System.out.println("a. Mançu- Tunguzca");
        System.out.println("b. Moğolca- Altayca");
        System.out.println("c. Kazakça- Kırgızca");
        System.out.println("d. Kıpçakça-Tatarca");
        System.out.println("e. Yakutça-Çuvaşça");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(58);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 59. soru
    public static void soru59(Scanner sc, char answer) {
        System.out.println("\033[35m" + "59. Aşağıda verilen dillerden hangisi Türkçenin şivelerinden biridir?");
        System.out.println("a. Moğolca");
        System.out.println("b. Kazakça");
        System.out.println("c. Tunguzca");
        System.out.println("d. Yakutça");
        System.out.println("e. Çuvaşça");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(59);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 60. soru
    public static void soru60(Scanner sc, char answer) {
        System.out.println("\033[34m" + "60. Aşağıda verilen dillerden hangisi Türkçenin şivelerinden biri değildir?");
        System.out.println("a. Kazakça");
        System.out.println("b. Kırgızca");
        System.out.println("c. Özbekçe");
        System.out.println("d. Türkmence");
        System.out.println("e. Yakutça");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(60);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 61. soru
    public static void soru61(Scanner sc, char answer) {
        System.out.println("\033[35m" + "61. Bir ülkede farklı konuşma dilleri yani çeşitli ağızlar bulunur. Fakat yazı dili tektir. Türkiye Türkçesinde farklı ağız bölgeleri olsa da yazı dilinin temsilcisi olan ağız ……… Türkçesidir.");
        System.out.println("Yukarıdaki boşluğa hangisi getirilmelidir?");
        System.out.println("a. Ankara");
        System.out.println("b. İstanbul");
        System.out.println("c. Trabzon");
        System.out.println("d. İzmir");
        System.out.println("e. Erzurum");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(61);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 62. soru
    public static void soru62(Scanner sc, char answer) {
        System.out.println("\033[34m" + "62. Aşağıdaki dillerden hangisi Ural-Altay dil ailesinden değildir?");
        System.out.println("a) Türkçe");
        System.out.println("b) Tibetçe");
        System.out.println("c) Moğolca");
        System.out.println("d) Mançuca");
        System.out.println("e) Tunguzca");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(62);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 63. soru
    public static void soru63(Scanner sc, char answer) {
        System.out.println("\033[35m" + "63. Aşağıdakilerden hangisi Orta Türkçe (Karahanlı Türkçesi) Dönemi eserlerinden değildir?");
        System.out.println("a) Irk Bitig");
        System.out.println("b) Dîvân-ı Hikmet");
        System.out.println("c) Atebetü’l- Hakâyık");
        System.out.println("d) Dîvânü Lugâti’t-Türk");
        System.out.println("e) Kutadgu Bilig");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(63);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 64. soru
    public static void soru64(Scanner sc, char answer) {
        System.out.println("\033[34m" + "64. Aşağıdakilerden hangisi Kıpçak (Kuzey) Türkçesi eserlerinden biridir?");
        System.out.println("a) Nehcü’l-Feradis");
        System.out.println("b) Kitâbü’l-İdrak li-Lisâni’l-Etrâk");
        System.out.println("c) Muhabbetnâme");
        System.out.println("d) Mecalisü’n-Nefâis");
        System.out.println("e) Babürname");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(64);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 65. soru
    public static void soru65(Scanner sc, char answer) {
        System.out.println("\033[35m" + "65. Aşağıdakilerden hangisi Türklerin kullandığı alfabelerden biri değildir?");
        System.out.println("a) Göktürk Alfabesi");
        System.out.println("b) İskandinav Alfabesi");
        System.out.println("c) Uygur Alfabesi");
        System.out.println("d) Arap Alfabesi");
        System.out.println("e) Latin Alfabesi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(65);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 66. soru
    public static void soru66(Scanner sc, char answer) {
        System.out.println("\033[34m" + "66. Aşağıdakilerden hangisi Güney-Batı (Oğuz) Türkçesinin bugünkü şivelerinden değildir?");
        System.out.println("a) Türkiye Türkçesi");
        System.out.println("b) Azerî Türkçesi");
        System.out.println("c) Gagavuz Türkçesi");
        System.out.println("d) Yakut Türkçesi");
        System.out.println("e) Türkmen Türkçesi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(66);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 67. soru
    public static void soru67(Scanner sc, char answer) {
        System.out.println("\033[35m" + "67. Aşağıdakilerden hangisinde yalnızca düz ünlüler yer almaktadır?");
        System.out.println("a. Kitapçılık");
        System.out.println("b. Yurttaşlık");
        System.out.println("c. Suçluluk");
        System.out.println("d. Köşeler");
        System.out.println("e. Sorgulama");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(67);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 68. soru
    public static void soru68(Scanner sc, char answer) {
        System.out.println("\033[34m" + "68. Aşağıdakilerden hangisi sadece dudak bölgesi ünsüzleriyle oluşmuş bir kelimedir?");
        System.out.println("a. pırıltılı");
        System.out.println("b. pembe");
        System.out.println("c. görüntüsüz");
        System.out.println("d. başarısızlık");
        System.out.println("e. meleyişi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(68);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 69. soru
    public static void soru69(Scanner sc, char answer) {
        System.out.println("\033[35m" + "69. Aşağıdakilerden hangisi bir gırtlak ünsüzüdür?");
        System.out.println("a. f");
        System.out.println("b. p");
        System.out.println("c. m");
        System.out.println("d. h");
        System.out.println("e. v");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(69);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 70. soru
    public static void soru70(Scanner sc, char answer) {
        System.out.println("\033[34m" + "70. Bu dillerde işleyişin temelini kök ve ekler oluşturur. Kelime köklerine çeşitli eklerin getirilmesiyle türetilen kelimelerin köklerinde bir değişme olmaz. Ekler kelime başına ya da sonuna getirilebilir.");
        System.out.println("Aşağıda verilen dillerden hangisi yukarıda verilen bilgilere örnek niteliğindedir?");
        System.out.println("a. Siyamca");
        System.out.println("b. Korece");
        System.out.println("c. Baskça");
        System.out.println("d. Çince");
        System.out.println("e. Tayca");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(70);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 71. soru
    public static void soru71(Scanner sc, char answer) {
        System.out.println("\033[35m" + "71. Tek veya çok heceli kökler ve ekler vardır. Kelime türetilirken ve çekim yapılırken kelime köklerindeki ünlüler değişime uğrar.");
        System.out.println("Aşağıda verilen dillerden hangisi yukarıda verilen bilgilere örnek niteliğindedir?");
        System.out.println("a. Siyamca");
        System.out.println("b. Korece");
        System.out.println("c. Çince");
        System.out.println("d. Arapça");
        System.out.println("e. Türkçe");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(71);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 72. soru
    public static void soru72(Scanner sc, char answer) {
        System.out.println("\033[34m" + "72. Türkçe yaşayan diller arasında en eski tarihe sahip dillerin de başında gelir. Bugün bilinen ilk yazılı metinlerimiz, 6-8. yüzyıllara ait ……. ve …….Kitabeleridir.");
        System.out.println("Yukarıdaki boşluğa hangileri getirilmelidir?");
        System.out.println("a. Maniheist ve Budist");
        System.out.println("b. Karahanlı ve Uygur");
        System.out.println("c. Yenisey ve Göktürk");
        System.out.println("d. Manas ve Kırgız");
        System.out.println("e. Altay ve Oğuz");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(72);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 73. soru
    public static void soru73(Scanner sc, char answer) {
        System.out.println("\033[35m" + "73. Aşağıdakilerden hangisi Türkçenin bilinmeyen bir zamanda ayrılan ve yeni bir dil olma yolu tutan lehçelerinden biridir?");
        System.out.println("a) Azerbaycan Türkçesi");
        System.out.println("b) Gagavuz Türkçesi");
        System.out.println("c) Yakutça");
        System.out.println("d) Tatar Türkçesi");
        System.out.println("e) Türkmen Türkçesi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(73);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 74. soru
    public static void soru74(Scanner sc, char answer) {
        System.out.println("\033[34m" + "74. Türkiye Türkçesi ve Azeri Türkçesi aşağıdakilerden hangisine mensuptur?");
        System.out.println("a) Oğuz Türkçesine");
        System.out.println("b) Çağatay Türkçesine");
        System.out.println("c) Kıpçak Türkçesine");
        System.out.println("d) Doğu Türkçesine");
        System.out.println("e) Uygur Türkçesine");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(74);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 75. soru
    public static void soru75(Scanner sc, char answer) {
        System.out.println("\033[35m" + "75. Aşağıdakilerden hangisi Göktürk alfabesinin özelliklerinden biri değildir?");
        System.out.println("a) Sağdan sola ya da yukarıdan aşağıya doğru yazılır.");
        System.out.println("b) Soldan sağa ya da aşağıdan yukarıya doğru yazılır.");
        System.out.println("c) Her harf birbirinden ayrı yazılır.");
        System.out.println("d) Sözcükler arasına “:” konur.");
        System.out.println("e) 38 harf bulunmaktadır.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(75);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 76. soru
    public static void soru76(Scanner sc, char answer) {
        System.out.println("\033[34m" + "76. Göktürk alfabesini ilk olarak çözen bilim insanı aşağıdakilerden hangisidir?");
        System.out.println("a) Annemarie von Gabain");
        System.out.println("b) Peter Zieme");
        System.out.println("c) Josef von Hammer");
        System.out.println("d) Wilhelm Thomsen");
        System.out.println("e) Andreas Tietze");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(76);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 77. soru
    public static void soru77(Scanner sc, char answer) {
        System.out.println("\033[35m" + "77. Dilin doğuşu teorilerinin amacı aşağıdakilerden hangisinde doğru verilmiştir?");
        System.out.println("a) Dilin nasıl ne zaman oluştuğu hakkında genellemelerde bulunmak");
        System.out.println("b) Dilin işleyişini araştırmak");
        System.out.println("c) Dilin yapısını betimlemek");
        System.out.println("d) Edebî dilin ortaya çıkmasına destek olmak");
        System.out.println("e) Yazı dili ve konuşma dili arasındaki farkı belirtmek.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(77);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 78. soru
    public static void soru78(Scanner sc, char answer) {
        System.out.println("\033[34m" + "78. İbrani alfabesini 16. yüzyıldan itibaren kullandığı görülen, fakat bugün sadece dini metinlerde kullanan Türk topluluğu aşağıdakilerden hangisidir?");
        System.out.println("a. Karay");
        System.out.println("b. Karaman");
        System.out.println("c. Tuva");
        System.out.println("d. Halaçça");
        System.out.println("e. Fu-yü Kırgızcası");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(78);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 79. soru
    public static void soru79(Scanner sc, char answer) {
        System.out.println("\033[35m" + "79. Uygur alfabesinin kaynağı aşağıdakilerden hangisine dayanmaktadır?");
        System.out.println("a. Göktürk");
        System.out.println("b. Avar");
        System.out.println("c. Soğud");
        System.out.println("d. İskit");
        System.out.println("e. Hun");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(79);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 80. soru
    public static void soru80(Scanner sc, char answer) {
        System.out.println("\033[34m" + "80. Dillerin kökeninin hayvan seslerinin taklidine dayandığını iddia eden görüş aşağıdakilerden hangisinde doğru verilmiştir?");
        System.out.println("a. Antropolojik Kuram");
        System.out.println("b. Yansıma Kuramı");
        System.out.println("c. İş Kuramı");
        System.out.println("d. Ruh Bilimsel Kuram");
        System.out.println("e. Güneş-Dil Kuramı");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(80);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 81. soru
    public static void soru81(Scanner sc, char answer) {
        System.out.println("\033[35m" + "81. Aşağıdakilerden hangisinde \"tek heceli diller\"in en tipik örnekleri birlikte ve doğru olarak verilmiştir?");
        System.out.println("a. Vietnamca-Tayca- Urduca");
        System.out.println("b. Keltçe-Baskça-Hintçe");
        System.out.println("c. Hitnçe- Çince-Tibetçe");
        System.out.println("d. Çince - Tibetçe - Vietnamca");
        System.out.println("e. Çince-Tibetçe-Korece");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(81);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 82. soru
    public static void soru82(Scanner sc, char answer) {
        System.out.println("\033[34m" + "82. Türkiye Türkçesi, Azeri Türkçesi ve Gagavuz Türkçesi aşağıdakilerden hangisine dâhildir?");
        System.out.println("a) Oğuz Türkçesine");
        System.out.println("b) Çağatay Türkçesine");
        System.out.println("c) Kıpçak Türkçesine");
        System.out.println("d) Doğu Türkçesine");
        System.out.println("e) Uygur Türkçesine");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(82);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 83. soru
    public static void soru83(Scanner sc, char answer) {
        System.out.println("\033[35m" + "I. Farklı coğrafyalarda yaşamış olmaları \n" +
                "II. Savaşlar \n" +
                "III. Göçler \n 83. Yukarıdakilerden hangisi yahut hangileri Türklerin tarih boyunca birçok farklı alfabe kullanmalarının temel sebepleri arasındadır?");
        System.out.println("a) I");
        System.out.println("b) II");
        System.out.println("c) I -II");
        System.out.println("d) I- III");
        System.out.println("e) Hepsi");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(83);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 84. soru
    public static void soru84(Scanner sc, char answer) {
        System.out.println("\033[34m" + "84. Prof. Dr. Osman Nedim Tuna’nın “…….. ve Türk Dillerinin Tarihi İlgisi ve Türk Dilinin Yaşı Meselesi” adlı araştırmasına dayanarak Türkçenin yaşının 6500 olduğunu söylemek mümkündür. Osman Nedim Tuna, iki dil arasında ortak olan yüz altmış sekiz kelimenin varlığını tespit etmiştir. Böylece «Türkçe, yaşayan diller arasında en eski yazılı belgelere sahip dildir» düşüncesi karşımıza çıkmıştır.");
        System.out.println("Yukarıda verilen paragraftaki boşluğa hangisi getirilmelidir?");
        System.out.println("a. Çin");
        System.out.println("b. Sümer");
        System.out.println("c. Kore");
        System.out.println("d. Moğol");
        System.out.println("e. İran");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(84);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 85. soru
    public static void soru85(Scanner sc, char answer) {
        System.out.println("\033[35m" + "85. Filologlara göre yeryüzünde yaklaşık olarak …………’den fazla lisan konuşulmaktadır?");
        System.out.println("Cümledeki boşluğa aşağıdakilerden hangisi getirilmelidir?");
        System.out.println("a) 1000");
        System.out.println("b) 2000");
        System.out.println("c) 3000");
        System.out.println("d) 4000");
        System.out.println("e) 5000");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(85);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 86. soru
    public static void soru86(Scanner sc, char answer) {
        System.out.println("\033[34m" + "86. Aşağıda Altay dillerinin özellikleri ile verilen bilgilerden hangisi yanlıştır?");
        System.out.println("a. Ünlü uyumları vardır.");
        System.out.println("b. Ünsüzlere göre ünlüler bakımından daha zengindir.");
        System.out.println("c. Kelimeler çift ünsüzle başlamaz.");
        System.out.println("d. Cinsiyet ayrımı gösteren ek bulunmaz.");
        System.out.println("e. Sayı sıfatlarından birinin bulunduğu sıfat tamlamalarında isim unsuru çoğul ek alır.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(86);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 87. soru
    public static void soru87(Scanner sc, char answer) {
        System.out.println("\033[35m" + "87. Aşağıda Türkçenin genel özellikleri ile verilen bilgilerden hangisi yanlıştır?");
        System.out.println("a. Türkçe sözcüklerde, Farsça, Fransızca vb. dillerde görülen erillik, dişillik özelliği yoktur.");
        System.out.println("b. Türkçe sayı sıfatlarından sonra gelen adlar çoğul eki almazlar.");
        System.out.println("c. Önlük-artlık (kalınlık-incelik) ve düzlük-yuvarlaklık uyumları vardır.");
        System.out.println("d. f, j ve h ünsüzleri Türkçe kökenli sözcüklerde bulunabilirler.");
        System.out.println("e. Türkçe sözcüklerde söz başında bulunabilen ünsüz sayısı sınırlıdır.");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(87);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }

    // 88. soru
    public static void soru88(Scanner sc, char answer) {
        System.out.println("\033[34m" + "88. ……………………… dil, kültür ve edebiyat özelliklerini başarılı bir şekilde yansıtan ve Türk yazı dilinin başlangıcı olarak kabul edilen eser Orhun Yazıtları’dır.");
        System.out.println("Yukarıdaki boşluğa hangisi getirilmelidir?");
        System.out.println("a. Ana Türkçe");
        System.out.println("b. Ana Altayca");
        System.out.println("c. Eski Türkçe");
        System.out.println("d. Proto Türkçe");
        System.out.println("e. Orta Türkçe");
        System.out.print("Lütfen işaretleyeceğiniz şıkkı giriniz : ");
        char cevap = sc.next().toLowerCase().charAt(0);
        if(cevap == answer) {
            System.out.println("\033[32m" + "Cevap doğru " + answer + " şıkkı");
            total++;
        } else {
            System.out.println("\033[31m" + "Yanlış işaretlediniz doğru cevap : " + answer + " şıkkı");
            wrongQuest.add(88);
        }
        System.out.println("\033[32m" + "------------------------------------------------");
    }
}
