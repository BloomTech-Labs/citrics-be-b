package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DSHistoricalWeather
{
    /**
     * This model is used to parse the historical
     * data coming in from the DS API
     */

    @JsonProperty("Jan_precip")
    private float sJan_precip;

    @JsonProperty("Jan_temp")
    private float sJan_temp;

    @JsonProperty("Feb_precip")
    private float sFeb_precip;

    @JsonProperty("Feb_temp")
    private float sFeb_temp;

    @JsonProperty("Mar_precip")
    private float sMar_precip;

    @JsonProperty("Mar_temp")
    private float sMar_temp;

    @JsonProperty("Apr_precip")
    private float sApr_precip;

    @JsonProperty("Apr_temp")
    private float sApr_temp;

    @JsonProperty("May_precip")
    private float sMay_precip;

    @JsonProperty("May_temp")
    private float sMay_temp;

    @JsonProperty("Jun_precip")
    private float sJun_precip;

    @JsonProperty("Jun_temp")
    private float sJun_temp;

    @JsonProperty("Jul_precip")
    private float sJul_precip;

    @JsonProperty("Jul_temp")
    private float sJul_temp;

    @JsonProperty("Aug_precip")
    private float sAug_precip;

    @JsonProperty("Aug_temp")
    private float sAug_temp;

    @JsonProperty("Sep_precip")
    private float sSep_precip;

    @JsonProperty("Sep_temp")
    private float sSep_temp;

    @JsonProperty("Oct_precip")
    private float sOct_precip;

    @JsonProperty("Oct_temp")
    private float sOct_temp;

    @JsonProperty("Nov_precip")
    private float sNov_precip;

    @JsonProperty("Nov_temp")
    private float sNov_temp;

    @JsonProperty("Dec_precip")
    private float sDec_precip;

    @JsonProperty("Dec_temp")
    private float sDec_temp;

    public DSHistoricalWeather()
    {
    }

    public float getsJan_precip()
    {
        return sJan_precip;
    }

    public void setsJan_precip(float sJan_precip)
    {
        this.sJan_precip = sJan_precip;
    }

    public float getsJan_temp()
    {
        return sJan_temp;
    }

    public void setsJan_temp(float sJan_temp)
    {
        this.sJan_temp = sJan_temp;
    }

    public float getsFeb_precip()
    {
        return sFeb_precip;
    }

    public void setsFeb_precip(float sFeb_precip)
    {
        this.sFeb_precip = sFeb_precip;
    }

    public float getsFeb_temp()
    {
        return sFeb_temp;
    }

    public void setsFeb_temp(float sFeb_temp)
    {
        this.sFeb_temp = sFeb_temp;
    }

    public float getsMar_precip()
    {
        return sMar_precip;
    }

    public void setsMar_precip(float sMar_precip)
    {
        this.sMar_precip = sMar_precip;
    }

    public float getsMar_temp()
    {
        return sMar_temp;
    }

    public void setsMar_temp(float sMar_temp)
    {
        this.sMar_temp = sMar_temp;
    }

    public float getsApr_precip()
    {
        return sApr_precip;
    }

    public void setsApr_precip(float sApr_precip)
    {
        this.sApr_precip = sApr_precip;
    }

    public float getsApr_temp()
    {
        return sApr_temp;
    }

    public void setsApr_temp(float sApr_temp)
    {
        this.sApr_temp = sApr_temp;
    }

    public float getsMay_precip()
    {
        return sMay_precip;
    }

    public void setsMay_precip(float sMay_precip)
    {
        this.sMay_precip = sMay_precip;
    }

    public float getsMay_temp()
    {
        return sMay_temp;
    }

    public void setsMay_temp(float sMay_temp)
    {
        this.sMay_temp = sMay_temp;
    }

    public float getsJun_precip()
    {
        return sJun_precip;
    }

    public void setsJun_precip(float sJun_precip)
    {
        this.sJun_precip = sJun_precip;
    }

    public float getsJun_temp()
    {
        return sJun_temp;
    }

    public void setsJun_temp(float sJun_temp)
    {
        this.sJun_temp = sJun_temp;
    }

    public float getsJul_precip()
    {
        return sJul_precip;
    }

    public void setsJul_precip(float sJul_precip)
    {
        this.sJul_precip = sJul_precip;
    }

    public float getsJul_temp()
    {
        return sJul_temp;
    }

    public void setsJul_temp(float sJul_temp)
    {
        this.sJul_temp = sJul_temp;
    }

    public float getsAug_precip()
    {
        return sAug_precip;
    }

    public void setsAug_precip(float sAug_precip)
    {
        this.sAug_precip = sAug_precip;
    }

    public float getsAug_temp()
    {
        return sAug_temp;
    }

    public void setsAug_temp(float sAug_temp)
    {
        this.sAug_temp = sAug_temp;
    }

    public float getsSep_precip()
    {
        return sSep_precip;
    }

    public void setsSep_precip(float sSep_precip)
    {
        this.sSep_precip = sSep_precip;
    }

    public float getsSep_temp()
    {
        return sSep_temp;
    }

    public void setsSep_temp(float sSep_temp)
    {
        this.sSep_temp = sSep_temp;
    }

    public float getsOct_precip()
    {
        return sOct_precip;
    }

    public void setsOct_precip(float sOct_precip)
    {
        this.sOct_precip = sOct_precip;
    }

    public float getsOct_temp()
    {
        return sOct_temp;
    }

    public void setsOct_temp(float sOct_temp)
    {
        this.sOct_temp = sOct_temp;
    }

    public float getsNov_precip()
    {
        return sNov_precip;
    }

    public void setsNov_precip(float sNov_precip)
    {
        this.sNov_precip = sNov_precip;
    }

    public float getsNov_temp()
    {
        return sNov_temp;
    }

    public void setsNov_temp(float sNov_temp)
    {
        this.sNov_temp = sNov_temp;
    }

    public float getsDec_precip()
    {
        return sDec_precip;
    }

    public void setsDec_precip(float sDec_precip)
    {
        this.sDec_precip = sDec_precip;
    }

    public float getsDec_temp()
    {
        return sDec_temp;
    }

    public void setsDec_temp(float sDec_temp)
    {
        this.sDec_temp = sDec_temp;
    }

    @Override
    public String toString()
    {
        return "DSHistoricalWeather{" +
            "sJan_precip=" + sJan_precip +
            ", sJan_temp=" + sJan_temp +
            ", sFeb_precip=" + sFeb_precip +
            ", sFeb_temp=" + sFeb_temp +
            ", sMar_precip=" + sMar_precip +
            ", sMar_temp=" + sMar_temp +
            ", sApr_precip=" + sApr_precip +
            ", sApr_temp=" + sApr_temp +
            ", sMay_precip=" + sMay_precip +
            ", sMay_temp=" + sMay_temp +
            ", sJun_precip=" + sJun_precip +
            ", sJun_temp=" + sJun_temp +
            ", sJul_precip=" + sJul_precip +
            ", sJul_temp=" + sJul_temp +
            ", sAug_precip=" + sAug_precip +
            ", sAug_temp=" + sAug_temp +
            ", sSep_precip=" + sSep_precip +
            ", sSep_temp=" + sSep_temp +
            ", sOct_precip=" + sOct_precip +
            ", sOct_temp=" + sOct_temp +
            ", sNov_precip=" + sNov_precip +
            ", sNov_temp=" + sNov_temp +
            ", sDec_precip=" + sDec_precip +
            ", sDec_temp=" + sDec_temp +
            '}';
    }
}
