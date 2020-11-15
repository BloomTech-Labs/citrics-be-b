package com.lambdaschool.foundation;

import com.fasterxml.jackson.databind.JsonNode;

public final class Utility {

  private Utility() {}

  /**
   * Return newData if it has been set, otherwise return original
   *
   * @param original The current value that may receive a new value
   * @param newData The new value that may or may not be set
   * @param fieldName Field name to check for
   * @return The new value, or old, as appropriate
   */
  public static Integer optionallyReplace(
    Integer original,
    JsonNode newData,
    String fieldName
  ) {
    // if newData doesn't have field, return original
    if (!newData.has(fieldName)) return original;

    // get field, then return value
    JsonNode field = newData.get(fieldName);
    // check if null was explicitly provided
    if (field.isNull()) return null;
    return field.asInt();
  }

  /**
   * Return newData if it has been set, otherwise return original
   *
   * @param original The current value that may receive a new value
   * @param newData The new value that may or may not be set
   * @param fieldName Field name to check for
   * @return The new value, or old, as appropriate
   */
  public static Double optionallyReplace(
    Double original,
    JsonNode newData,
    String fieldName
  ) {
    // if newData doesn't have field, return original
    if (!newData.has(fieldName)) return original;

    // get field, then return value
    JsonNode field = newData.get(fieldName);
    // check if null was explicitly provided
    if (field.isNull()) return null;
    return field.asDouble();
  }

  /**
   * Return newData if it has been set, otherwise return original
   *
   * @param original The current value that may receive a new value
   * @param newData The new value that may or may not be set
   * @param fieldName Field name to check for
   * @return The new value, or old, as appropriate
   */
  public static String optionallyReplace(
    String original,
    JsonNode newData,
    String fieldName
  ) {
    // if newData doesn't have field, return original
    if (!newData.has(fieldName)) return original;

    // get field, then return value
    JsonNode field = newData.get(fieldName);
    // check if null was explicitly provided
    if (field.isNull()) return null;
    return field.asText();
  }
}
