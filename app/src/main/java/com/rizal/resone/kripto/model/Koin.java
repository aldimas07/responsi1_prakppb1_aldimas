package com.rizal.resone.kripto.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.rizal.resone.kripto.R;

import java.util.Arrays;
import java.util.List;

public class Koin implements Parcelable {
    private int icon;
    private String nama;
    private String deskripsi;
    private String sejarah;
    private String link;
    public static List<Koin> listKoin = Arrays.asList(
            new Koin(R.drawable.bitcoin, "Bitcoin", "Bitcoin adalah sebuah uang elektronik yang dibuat pada tahun 2009 oleh Satoshi Nakamoto. Nama tersebut juga dikaitkan dengan perangkat lunak sumber terbuka yang dia rancang, dan juga menggunakan jaringan peer-to-peer tanpa penyimpanan terpusat atau administrator tunggal di mana Departemen Keuangan Amerika Serikat menyebut bitcoin sebuah mata uang yang terdesentralisasi.", "The domain name bitcoin.org was registered on 18 August 2008. On 31 October 2008, a link to a paper authored by Satoshi Nakamoto titled Bitcoin: A Peer-to-Peer Electronic Cash System[4] was posted to a cryptography mailing list. Nakamoto implemented the bitcoin software as open-source code and released it in January 2009. Nakamoto\\'s identity remains unknown.\n On 3 January 2009, the bitcoin network was created when Nakamoto mined the starting block of the chain, known as the genesis block. Embedded in the coinbase of this block was the text \"The Times 03/Jan/2009 Chancellor on brink of second bailout for banks\". This note references a headline published by The Times and has been interpreted as both a timestamp and a comment on the instability caused by fractional-reserve banking.", "https://bitcoin.org/id/"),
            new Koin(R.drawable.solana, "Solana", "Solana is a public blockchain platform with smart contract functionality. Its native cryptocurrency is SOL.", "Solana was proposed in a white paper Anatoly Yakovenko which was published in November of 2017. This paper described a technique called \"proof of history\".\n\nOn 16 March 2020, Solana's first block was created.\n\nIn September 2021, Bloomberg journalist Joanna Ossinger described Solana as \"a potential long-term rival for Ethereum\", citing superior transaction speeds and lower associated costs.", "https://solana.com/id"),
            new Koin(R.drawable.xrp, "Ripple (XRP)", "Ripple as a protocol is a system of the real time gross settlements (RTGS), exchange and money transfer system. Another name is Ripple transaction protocol (RTXP), or Ripple protocol. It is built upon a distributed open Internet protocol, consensus ledger and its own currency called XRP.", "Ripple coin was first implemented in 2004 by Ryan Fugger, a Web developer in Vancouver, B.C., Canada. In 2005, Fugger began to build Ripplepay as a financial service to provide secure payment options to members of an online community via a global network. On the basis of this protocol, a new digital currency system appeared in May 2011, for which its own crypto currency XRP was issued.\n\nThis led to the development of a new system in 2011 by Jed McCaleb. It was designed to eliminate Bitcoin's reliance on centralized exchanges, use less electricity than Bitcoin, and perform transactions much more quickly than Bitcoin.\n\nRTXP was launched in 2012, its main goal is to ensure “secure, instant and almost free global money operations of any size without any chargebacks”. The protocol supports payment with fiat currency, crypto currency, goods or any other units like passenger bonus miles or mobile minutes.\n\nAs the transactions in this system are confirmed by the consensus of network participants instead of mining like in the Bitcoin network, it causes more trust of banks and payment networks. For example, the RTXP is used by the Earthport service payment system, which is working in 65 countries, including the Bank of America and the HSBC bank.\n\nToday, XRP is amongst the largest digital currencies in the capitalization.", "https://ripple.com/xrp/"),
            new Koin(R.drawable.dogecoin, "Dogecoin", "Dogecoin (DOGE, symbol: Ð and D) is a Litecoin-derived cryptocurrency featuring a Shiba Inu from the Doge Internet meme on its logo.", "The users themselves call it “joky”. One of the most popular uses of the coin is the reward of Internet users for interesting and quality content created or shared by them. It was introduced on December 8, 2013.", "https://dogecoin.com/"),
            new Koin(R.drawable.binance, "Binance", "Binance is the Chinese cryptocurrency exchange. As of March 2018, it is the largest one by the transaction volume per day. The CEO and founder of the Binance exchange is Changpeng Zhao. After the prohibition of Chinese authorities against the cryptocurrency operations, it changed its jurisdiction and now, the offices are located in Hong Kong and Tokyo. In March 2018, it faced a massive hacker attack, which was not successful.", "Changpeng Zhao founded Binance in July 2017 in China. A few days before the launch of the exchange, Zhao raised $15 million in an ICO. Investors got their BNB tokens as part of the ICO. At the very beginning of Binance, Zhao was already aiming at scaling Binance Exchange into an entire blockchain ecosystem.\n\nWithin 6 months from its launch, Binance became the largest cryptocurrency exchange in the world. However, because of the ban of crypto exchanges by the Chinese government, Binance was forced to relocate. In 2020, Zhao claimed Binance headquarters to be where Zhao himself was. The absence of headquarters created Binance a list of problems concerning regulation of the platform’s operation in a number of countries. In April 2022, Zhao shared that the company would soon announce Binance’s permanent headquarters.", "https://www.binance.com/en"),
            new Koin(R.drawable.cardano, "Cardano", "Cardano is a decentralized block platform on opensource smart contracts\n\nOn the basis of the Cardano platform, here is a Cardano coin – ADA – cryptocurrency, which can be bought on exchanges, such as Binance or Bittrex for an attractive price and can be stored on the Daedalus wallet.", "launched in September 2017 by Blockchain Development Output Hong Kong (IOHK).", "https://cardano.org/"),
            new Koin(R.drawable.ethereum, "Ethereum", "Ethereum (ETH) is an open-source, public, blockchain-based distributed computing platform featuring smart contract (scripting) functionality. It provides a decentralized Turing-complete virtual machine (Ethereum VM), the Ethereum Virtual Machine (VM), which can execute scripts using an international network of public nodes.\n\nEthereum also provides a cryptocurrency token called \"ether\", which can be transferred between accounts and used to compensate participant nodes for computations performed. \"Gas\", an internal transaction pricing mechanism, is used to mitigate spam and allocate resources on the network.", "Ethereum was initially described in Ethereum white paper by Vitalik Buterin, a programmer involved with Bitcoin Magazine, in late 2013 with a goal of building decentralized applications. Buterin had argued that Bitcoin needed a scripting language for application development. Failing to gain agreement, he proposed development of a new platform with a more general scripting language.\n\nAt the time of public announcement in January 2014, the core Ethereum team was Vitalik Buterin, Mihai Alisie, Anthony Di Iorio, and Charles Hoskinson.Formal development of the Ethereum software project began in early 2014 through a Swiss company, Ethereum Switzerland GmbH (EthSuisse). Subsequently, a Swiss non-profit foundation, the Ethereum Foundation (Stiftung Ethereum), was created as well. Development was funded by an online public crowdsale during July–August 2014, with the participants buying the Ethereum value token (ether) with another digital currency, bitcoin. While there was early praise for the technical innovations of Ethereum, questions were also raised about its security and scalability.", "https://ethereum.org/en/"),
            new Koin(R.drawable.tether, "Tether", "Tether (USDT) is a cryptocurrency with reference to fiat currencies that is issued by Tether Limited Company. Using the technology of blockchain, Tether coin allows the users to keep, send and receive digital tokens pegged to dollars, euros, and yens.", "Berawal dari whitepaper (kertas putih) yang diterbitkan secara daring pada tahun 2012, J.R. Willett yang melanjutkan untuk membantu mengimplementasikan ide ini dalam mata uang kripto Mastercoin, yang merupakan bagian dari Mastercoin Foundation untuk mempromosikan penggunaan \"lapisan kedua\" saat ini. Pendiri Tether lainnya ialah Craig Sellars, CTO dari Mastercoin Foundation.\n\nPada mulanya Tether dijuluki Realcoin dan diumumkan pada tahun 2014 oleh para pendiri Brock Pierce, Reeve Collins, dan Craig Sellars sebagai perusahaan rintisan bertempat di Santa Monica, California. Token pertama dikeluarkan pada 6 Oktober 2014 dibangun di jaringan blockchain Bitcoin melalui penggunaan platform Omni. Kemudian pada 20 November 2014, CEO Tether, Reeve Collins mengumumkan bahwa proyek ini diubah nama menjadi \"Tether\".", "https://tether.to/en/")
    );

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Koin(int icon, String nama, String deskripsi, String sejarah, String link) {
        this.icon = icon;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.sejarah = sejarah;
        this.link = link;
    }


    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getSejarah() {
        return sejarah;
    }

    public void setSejarah(String sejarah) {
        this.sejarah = sejarah;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.icon);
        dest.writeString(this.nama);
        dest.writeString(this.deskripsi);
        dest.writeString(this.sejarah);
        dest.writeString(this.link);
    }

    public void readFromParcel(Parcel source) {
        this.icon = source.readInt();
        this.nama = source.readString();
        this.deskripsi = source.readString();
        this.sejarah = source.readString();
        this.link = source.readString();
    }

    protected Koin(Parcel in) {
        this.icon = in.readInt();
        this.nama = in.readString();
        this.deskripsi = in.readString();
        this.sejarah = in.readString();
        this.link = in.readString();
    }

    public static final Parcelable.Creator<Koin> CREATOR = new Parcelable.Creator<Koin>() {
        @Override
        public Koin createFromParcel(Parcel source) {
            return new Koin(source);
        }

        @Override
        public Koin[] newArray(int size) {
            return new Koin[size];
        }
    };
}
