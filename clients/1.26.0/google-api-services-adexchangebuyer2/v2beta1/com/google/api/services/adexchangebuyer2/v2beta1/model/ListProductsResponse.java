/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * Response message for listing products visible to the buyer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListProductsResponse extends com.google.api.client.json.GenericJson {

  /**
   * List pagination support.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of matching products at their head revision number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Product> products;

  static {
    // hack to force ProGuard to consider Product used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Product.class);
  }

  /**
   * List pagination support.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * List pagination support.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListProductsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of matching products at their head revision number.
   * @return value or {@code null} for none
   */
  public java.util.List<Product> getProducts() {
    return products;
  }

  /**
   * The list of matching products at their head revision number.
   * @param products products or {@code null} for none
   */
  public ListProductsResponse setProducts(java.util.List<Product> products) {
    this.products = products;
    return this;
  }

  @Override
  public ListProductsResponse set(String fieldName, Object value) {
    return (ListProductsResponse) super.set(fieldName, value);
  }

  @Override
  public ListProductsResponse clone() {
    return (ListProductsResponse) super.clone();
  }

}
