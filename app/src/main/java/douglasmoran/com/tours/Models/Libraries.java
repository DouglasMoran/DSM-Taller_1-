package douglasmoran.com.tours.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Libraries implements Parcelable {

    private int id;
    private String imgRecyclerView;
    private String tittle;
    private String country;
    private String mainDescription;
    private String history;
    private String construction;
    private String jewel;
    private String curiosity;
    private String desingBy;
    private String address;
    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String img5;
    private String img6;

    public Libraries(int id, String imgRecyclerView, String tittle, String country, String mainDescription, String history, String construction, String jewel, String curiosity, String desingBy, String address, String img1, String img2, String img3, String img4, String img5, String img6) {
        this.id = id;
        this.imgRecyclerView = imgRecyclerView;
        this.tittle = tittle;
        this.country = country;
        this.mainDescription = mainDescription;
        this.history = history;
        this.construction = construction;
        this.jewel = jewel;
        this.curiosity = curiosity;
        this.desingBy = desingBy;
        this.address = address;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
    }




    protected Libraries(Parcel in) {
    }

    public static final Creator<Libraries> CREATOR = new Creator<Libraries>() {
        @Override
        public Libraries createFromParcel(Parcel in) {
            return new Libraries(in);
        }

        @Override
        public Libraries[] newArray(int size) {
            return new Libraries[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgRecyclerView() {
        return imgRecyclerView;
    }

    public void setImgRecyclerView(String imgRecyclerView) {
        this.imgRecyclerView = imgRecyclerView;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMainDescription() {
        return mainDescription;
    }

    public void setMainDescription(String mainDescription) {
        this.mainDescription = mainDescription;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public String getJewel() {
        return jewel;
    }

    public void setJewel(String jewel) {
        this.jewel = jewel;
    }

    public String getCuriosity() {
        return curiosity;
    }

    public void setCuriosity(String curiosity) {
        this.curiosity = curiosity;
    }

    public String getDesingBy() {
        return desingBy;
    }

    public void setDesingBy(String desingBy) {
        this.desingBy = desingBy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public String getImg5() {
        return img5;
    }

    public void setImg5(String img5) {
        this.img5 = img5;
    }

    public String getImg6() {
        return img6;
    }

    public void setImg6(String img6) {
        this.img6 = img6;
    }

    public static Creator<Libraries> getCREATOR() {
        return CREATOR;
    }

    @Override
    public void writeToParcel(Parcel desc, int flags) {

        desc.writeInt(id);
        desc.writeString(imgRecyclerView);
        desc.writeString(tittle);
        desc.writeString(country);
        desc.writeString(mainDescription);
        desc.writeString(history);
        desc.writeString(jewel);
        desc.writeString(curiosity);
        desc.writeString(desingBy);
        desc.writeString(address);
        desc.writeString(img1);
        desc.writeString(img2);
        desc.writeString(img3);
        desc.writeString(img4);
        desc.writeString(img5);
        desc.writeString(img6);

    }
}
