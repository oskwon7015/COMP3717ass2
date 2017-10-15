package ca.bcit.ass2.kwon_guo;

import java.util.List;

/**
 * Created by nelson on 10/9/2017.
 */

public class Country {

    private String name;

    private List<String> topLevelDomain;

    private String alpha2Code;

    private String alpha3Code;

    private List<String> callingCodes;

    private String capital;

    private List<String> altSpellings;

    private String region;

    private String subregion;

    private long population;

    private List<Double> latlng;

    private String demonym;

    private double area;

    private String gini;

    private List<String> timezones;

    private List<String> borders;

    private String nativeName;

    private String numericCode;

    private List<Currencies> currencies;

    private List<Languages> languages;

    private Translations translations;

    private String flag;

    private List<String> regionalBlocs;

    private String cioc;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setTopLevelDomain(List<String> topLevelDomain){
        this.topLevelDomain = topLevelDomain;
    }
    public List<String> getTopLevelDomain(){
        return this.topLevelDomain;
    }
    public void setAlpha2Code(String alpha2Code){
        this.alpha2Code = alpha2Code;
    }
    public String getAlpha2Code(){
        return this.alpha2Code;
    }
    public void setAlpha3Code(String alpha3Code){
        this.alpha3Code = alpha3Code;
    }
    public String getAlpha3Code(){
        return this.alpha3Code;
    }
    public void setCallingCodes(List<String> callingCodes){
        this.callingCodes = callingCodes;
    }
    public List<String> getCallingCodes(){
        return this.callingCodes;
    }
    public void setCapital(String capital){
        this.capital = capital;
    }
    public String getCapital(){
        return this.capital;
    }
    public void setAltSpellings(List<String> altSpellings){
        this.altSpellings = altSpellings;
    }
    public List<String> getAltSpellings(){
        return this.altSpellings;
    }
    public void setRegion(String region){
        this.region = region;
    }
    public String getRegion(){
        return this.region;
    }
    public void setSubregion(String subregion){
        this.subregion = subregion;
    }
    public String getSubregion(){
        return this.subregion;
    }
    public void setPopulation(long population){
        this.population = population;
    }
    public long getPopulation(){
        return this.population;
    }
    public void setLatlng(List<Double> latlng){
        this.latlng = latlng;
    }
    public List<Double> getLatlng(){
        return this.latlng;
    }
    public void setDemonym(String demonym){
        this.demonym = demonym;
    }
    public String getDemonym(){
        return this.demonym;
    }
    public void setArea(double area){
        this.area = area;
    }
    public double getArea(){
        return this.area;
    }
    public void setGini(String gini){
        this.gini = gini;
    }
    public String getGini(){
        return this.gini;
    }
    public void setTimezones(List<String> timezones){
        this.timezones = timezones;
    }
    public List<String> getTimezones(){
        return this.timezones;
    }
    public void setBorders(List<String> borders){
        this.borders = borders;
    }
    public List<String> getBorders(){
        return this.borders;
    }
    public void setNativeName(String nativeName){
        this.nativeName = nativeName;
    }
    public String getNativeName(){
        return this.nativeName;
    }
    public void setNumericCode(String numericCode){
        this.numericCode = numericCode;
    }
    public String getNumericCode(){
        return this.numericCode;
    }
    public void setCurrencies(List<Currencies> currencies){
        this.currencies = currencies;
    }
    public List<Currencies> getCurrencies(){
        return this.currencies;
    }
    public void setLanguages(List<Languages> languages){
        this.languages = languages;
    }
    public List<Languages> getLanguages(){
        return this.languages;
    }
    public void setTranslations(Translations translations){
        this.translations = translations;
    }
    public Translations getTranslations(){
        return this.translations;
    }
    public void setFlag(String flag){
        this.flag = flag;
    }
    public String getFlag(){
        return this.flag;
    }
    public void setRegionalBlocs(List<String> regionalBlocs){
        this.regionalBlocs = regionalBlocs;
    }
    public List<String> getRegionalBlocs(){
        return this.regionalBlocs;
    }
    public void setCioc(String cioc){
        this.cioc = cioc;
    }
    public String getCioc(){
        return this.cioc;
    }


}

 class Currencies
{
    private String code;

    private String name;

    private String symbol;

    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    public String getSymbol(){
        return this.symbol;
    }
}

class Languages
{
    private String iso639_1;

    private String iso639_2;

    private String name;

    private String nativeName;

    public void setIso639_1(String iso639_1){
        this.iso639_1 = iso639_1;
    }
    public String getIso639_1(){
        return this.iso639_1;
    }
    public void setIso639_2(String iso639_2){
        this.iso639_2 = iso639_2;
    }
    public String getIso639_2(){
        return this.iso639_2;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setNativeName(String nativeName){
        this.nativeName = nativeName;
    }
    public String getNativeName(){
        return this.nativeName;
    }
}

class Translations
{
    private String de;

    private String es;

    private String fr;

    private String ja;

    private String it;

    private String br;

    private String pt;

    private String nl;

    private String hr;

    private String fa;

    public void setDe(String de){
        this.de = de;
    }
    public String getDe(){
        return this.de;
    }
    public void setEs(String es){
        this.es = es;
    }
    public String getEs(){
        return this.es;
    }
    public void setFr(String fr){
        this.fr = fr;
    }
    public String getFr(){
        return this.fr;
    }
    public void setJa(String ja){
        this.ja = ja;
    }
    public String getJa(){
        return this.ja;
    }
    public void setIt(String it){
        this.it = it;
    }
    public String getIt(){
        return this.it;
    }
    public void setBr(String br){
        this.br = br;
    }
    public String getBr(){
        return this.br;
    }
    public void setPt(String pt){
        this.pt = pt;
    }
    public String getPt(){
        return this.pt;
    }
    public void setNl(String nl){
        this.nl = nl;
    }
    public String getNl(){
        return this.nl;
    }
    public void setHr(String hr){
        this.hr = hr;
    }
    public String getHr(){
        return this.hr;
    }
    public void setFa(String fa){
        this.fa = fa;
    }
    public String getFa(){
        return this.fa;
    }
}

