package Application.Components;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;
import java.util.Vector;

public class DataImage extends BufferedImage {


    public DataImage(int width, int height, int imageType) {
        super(width, height, imageType);
    }

    public DataImage(int width, int height, int imageType, IndexColorModel cm) {
        super(width, height, imageType, cm);
    }

    public DataImage(ColorModel cm, WritableRaster raster, boolean isRasterPremultiplied, Hashtable<?, ?> properties) {
        super(cm, raster, isRasterPremultiplied, properties);
    }

    @Override
    public int getType() {
        return super.getType();
    }

    @Override
    public ColorModel getColorModel() {
        return super.getColorModel();
    }

    @Override
    public WritableRaster getRaster() {
        return super.getRaster();
    }

    @Override
    public WritableRaster getAlphaRaster() {
        return super.getAlphaRaster();
    }

    @Override
    public int getRGB(int x, int y) {
        return super.getRGB(x, y);
    }

    @Override
    public int[] getRGB(int startX, int startY, int w, int h, int[] rgbArray, int offset, int scansize) {
        return super.getRGB(startX, startY, w, h, rgbArray, offset, scansize);
    }

    @Override
    public synchronized void setRGB(int x, int y, int rgb) {
        super.setRGB(x, y, rgb);
    }

    @Override
    public void setRGB(int startX, int startY, int w, int h, int[] rgbArray, int offset, int scansize) {
        super.setRGB(startX, startY, w, h, rgbArray, offset, scansize);
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public int getWidth(ImageObserver observer) {
        return super.getWidth(observer);
    }

    @Override
    public int getHeight(ImageObserver observer) {
        return super.getHeight(observer);
    }

    @Override
    public ImageProducer getSource() {
        return super.getSource();
    }

    @Override
    public Object getProperty(String name, ImageObserver observer) {
        return super.getProperty(name, observer);
    }

    @Override
    public Object getProperty(String name) {
        return super.getProperty(name);
    }

    @Override
    public Graphics getGraphics() {
        return super.getGraphics();
    }

    @Override
    public Graphics2D createGraphics() {
        return super.createGraphics();
    }

    @Override
    public BufferedImage getSubimage(int x, int y, int w, int h) {
        return super.getSubimage(x, y, w, h);
    }

    @Override
    public boolean isAlphaPremultiplied() {
        return super.isAlphaPremultiplied();
    }

    @Override
    public void coerceData(boolean isAlphaPremultiplied) {
        super.coerceData(isAlphaPremultiplied);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Vector<RenderedImage> getSources() {
        return super.getSources();
    }

    @Override
    public String[] getPropertyNames() {
        return super.getPropertyNames();
    }

    @Override
    public int getMinX() {
        return super.getMinX();
    }

    @Override
    public int getMinY() {
        return super.getMinY();
    }

    @Override
    public SampleModel getSampleModel() {
        return super.getSampleModel();
    }

    @Override
    public int getNumXTiles() {
        return super.getNumXTiles();
    }

    @Override
    public int getNumYTiles() {
        return super.getNumYTiles();
    }

    @Override
    public int getMinTileX() {
        return super.getMinTileX();
    }

    @Override
    public int getMinTileY() {
        return super.getMinTileY();
    }

    @Override
    public int getTileWidth() {
        return super.getTileWidth();
    }

    @Override
    public int getTileHeight() {
        return super.getTileHeight();
    }

    @Override
    public int getTileGridXOffset() {
        return super.getTileGridXOffset();
    }

    @Override
    public int getTileGridYOffset() {
        return super.getTileGridYOffset();
    }

    @Override
    public Raster getTile(int tileX, int tileY) {
        return super.getTile(tileX, tileY);
    }

    @Override
    public Raster getData() {
        return super.getData();
    }

    @Override
    public Raster getData(Rectangle rect) {
        return super.getData(rect);
    }

    @Override
    public WritableRaster copyData(WritableRaster outRaster) {
        return super.copyData(outRaster);
    }

    @Override
    public void setData(Raster r) {
        super.setData(r);
    }

    @Override
    public void addTileObserver(TileObserver to) {
        super.addTileObserver(to);
    }

    @Override
    public void removeTileObserver(TileObserver to) {
        super.removeTileObserver(to);
    }

    @Override
    public boolean isTileWritable(int tileX, int tileY) {
        return super.isTileWritable(tileX, tileY);
    }

    @Override
    public Point[] getWritableTileIndices() {
        return super.getWritableTileIndices();
    }

    @Override
    public boolean hasTileWriters() {
        return super.hasTileWriters();
    }

    @Override
    public WritableRaster getWritableTile(int tileX, int tileY) {
        return super.getWritableTile(tileX, tileY);
    }

    @Override
    public void releaseWritableTile(int tileX, int tileY) {
        super.releaseWritableTile(tileX, tileY);
    }

    @Override
    public int getTransparency() {
        return super.getTransparency();
    }

    public void setData(int data[]) {
        WritableRaster raster = this.getRaster();
        raster.setPixels(0, 0, this.getWidth(), this.getHeight(), data);
    }

    public void setData(float data[]) {
        WritableRaster raster = this.getRaster();
        raster.setPixels(0, 0, this.getWidth(), this.getHeight(), data);
    }

    public void setData(double data[]) {
        WritableRaster raster = this.getRaster();
        raster.setPixels(0, 0, this.getWidth(), this.getHeight(), data);
    }
}
