/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.visual_recognition.v3.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * The detectFaces options.
 */
public class DetectFacesOptions extends GenericModel {

  private InputStream imagesFile;
  private String imagesFilename;
  private String url;
  private String imagesFileContentType;
  @Deprecated
  private String parameters;

  /**
   * Builder.
   */
  public static class Builder {
    private InputStream imagesFile;
    private String imagesFilename;
    private String url;
    private String imagesFileContentType;
    @Deprecated
    private String parameters;

    private Builder(DetectFacesOptions detectFacesOptions) {
      imagesFile = detectFacesOptions.imagesFile;
      imagesFilename = detectFacesOptions.imagesFilename;
      url = detectFacesOptions.url;
      imagesFileContentType = detectFacesOptions.imagesFileContentType;
      parameters = detectFacesOptions.parameters;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DetectFacesOptions.
     *
     * @return the detectFacesOptions
     */
    public DetectFacesOptions build() {
      return new DetectFacesOptions(this);
    }

    /**
     * Set the imagesFile.
     *
     * @param imagesFile the imagesFile
     * @return the DetectFacesOptions builder
     */
    public Builder imagesFile(InputStream imagesFile) {
      this.imagesFile = imagesFile;
      return this;
    }

    /**
     * Set the imagesFilename.
     *
     * @param imagesFilename the imagesFilename
     * @return the DetectFacesOptions builder
     */
    public Builder imagesFilename(String imagesFilename) {
      this.imagesFilename = imagesFilename;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the DetectFacesOptions builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the imagesFileContentType.
     *
     * @param imagesFileContentType the imagesFileContentType
     * @return the DetectFacesOptions builder
     */
    public Builder imagesFileContentType(String imagesFileContentType) {
      this.imagesFileContentType = imagesFileContentType;
      return this;
    }

    /**
     * Set the imagesFile.
     *
     * @param imagesFile the imagesFile
     * @return the DetectFacesOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder imagesFile(File imagesFile) throws FileNotFoundException {
      this.imagesFile = new FileInputStream(imagesFile);
      this.imagesFilename = imagesFile.getName();
      return this;
    }

    /**
     * Set the parameters.
     *
     * @param parameters the parameters
     * @return the DetectFacesOptions builder
     * @deprecated replaced by the url parameter
     */
    public Builder parameters(String parameters) {
      this.parameters = parameters;
      return this;
    }
  }

  private DetectFacesOptions(Builder builder) {
    imagesFile = builder.imagesFile;
    imagesFilename = builder.imagesFilename;
    url = builder.url;
    imagesFileContentType = builder.imagesFileContentType;
    parameters = builder.parameters;
  }

  /**
   * New builder.
   *
   * @return a DetectFacesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the imagesFile.
   *
   * An image file (.jpg, .png) or .zip file with images. Include no more than 15 images. All faces are detected, but if
   * there are more than 10 faces in an image, age and gender confidence scores might return scores of 0. You can also
   * include an image with the **url** parameter.
   *
   * @return the imagesFile
   */
  public InputStream imagesFile() {
    return imagesFile;
  }

  /**
   * Gets the imagesFilename.
   *
   * The filename for imagesFile.
   *
   * @return the imagesFilename
   */
  public String imagesFilename() {
    return imagesFilename;
  }

  /**
   * Gets the url.
   *
   * The URL of an image to analyze. Must be in .jpg, or .png format. The minimum recommended pixel density is 32X32
   * pixels per inch, and the maximum image size is 2 MB. You can also include images with the **images_file**
   * parameter.
   *
   * @return the url
   */
  public String url() {
    return url;
  }

  /**
   * Gets the imagesFileContentType.
   *
   * The content type of imagesFile. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the imagesFileContentType
   */
  public String imagesFileContentType() {
    return imagesFileContentType;
  }

  /**
   * Gets the parameters.
   *
   * @return the parameters
   * @deprecated replaced by the url parameter
   */
  public String parameters() {
    return parameters;
  }
}
