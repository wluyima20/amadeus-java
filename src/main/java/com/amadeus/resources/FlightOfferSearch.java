package com.amadeus.resources;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

/**
 * An Airline object as returned by the Airline Code LookUp API.
 * @see com.amadeus.shopping.FlightOffersSearch#get()
 */
@ToString
public class FlightOfferSearch extends Resource {
  private @Getter String type;
  private @Getter String id;
  private @Getter String source;
  private @Getter boolean instantTicketingRequired;
  private @Getter boolean disablePricing;
  private @Getter boolean nonHomogeneous;
  private @Getter boolean oneWay;
  private @Getter boolean paymentCardRequired;
  private @Getter String lastTicketingDate;
  private @Getter int numberOfBookableSeats;
  private @Getter Itinerary[] itineraries;
  private @Getter SearchPrice price;
  private @Getter PricingOptions pricingOptions;
  private @Getter String[] validatingAirlineCodes;
  private @Getter TravelerPricing[] travelerPricings;
  private @Getter String choiceProbability;
  private @Getter FareRules fareRules;

  protected FlightOfferSearch() {}

  @ToString
  public static class Itinerary {
    private @Getter String duration;
    private @Getter SearchSegment[] segments;

    protected Itinerary() {}

  }

  @ToString
  public static class SearchSegment {
    private @Getter AirportInfo departure;
    private @Getter AirportInfo arrival;
    private @Getter String carrierCode;
    private @Getter String number;
    private @Getter Aircraft aircraft;
    private @Getter OperatingFlight operating;
    private @Getter String duration;
    private @Getter FlightStop[] stops;
    private @Getter String id;
    private @Getter int numberOfStops;
    private @Getter boolean blacklistedInEU;
    private @Getter Co2Emissions[] co2Emissions;

    protected SearchSegment() {}
  }

  @ToString
  public static class OperatingFlight {
    private @Getter String carrierCode;

    protected OperatingFlight() {}
  }

  @ToString
  public static class FlightStop {
    private @Getter String iataCode;
    private @Getter String duration;
    private @Getter String arrivalAt;
    private @Getter String departureAt;

    protected FlightStop() {}
  }

  @ToString
  public static class Co2Emissions {
    private @Getter int weight;
    private @Getter String weightUnit;
    private @Getter String cabin;

    protected Co2Emissions() {}
  }

  @ToString
  public static class AirportInfo {
    private @Getter String iataCode;
    private @Getter String terminal;
    private @Getter String at;

    protected AirportInfo() {}
  }

  @ToString
  public static class Aircraft {
    private @Getter String code;

    protected Aircraft() {}
  }

  @ToString
  public static class SearchPrice {
    private @Getter String currency;
    private @Getter String total;
    private @Getter String base;
    private @Getter Fee[] fees;
    private @Getter String grandTotal;
    private @Getter Tax[] taxes;
    private @Getter String refundableTaxes;
    private @Getter String margin;
    private @Getter String billingCurrency;
    private @Getter AdditionalService[] additionalServices;

    protected SearchPrice() {}
  }

  @ToString
  public static class Fee {
    private @Getter String amount;
    private @Getter String type;

    protected Fee() {}
  }

  @ToString
  public static class Tax {
    private @Getter String amount;
    private @Getter String code;

    protected Tax() {}
  }

  @ToString
  public static class AdditionalService {
    private @Getter String amount;
    private @Getter String type;

    protected AdditionalService() {}
  }

  @ToString
  public static class PricingOptions {
    private @Getter boolean includedCheckedBagsOnly;
    private @Getter String[] fareType;
    private @Getter String[] corporateCodes;
    private @Getter boolean refundableFare;
    private @Getter boolean noRestrictionFare;
    private @Getter boolean noPenaltyFare;
  }

  @ToString
  public static class TravelerPricing {
    private @Getter String travelerId;
    private @Getter String fareOption;
    private @Getter String travelerType;
    private @Getter String associatedAdultId;
    private @Getter SearchPrice price;
    private @Getter FareDetailsBySegment[] fareDetailsBySegment;

    protected TravelerPricing() {}
  }

  @ToString
  public static class FareDetailsBySegment {
    private @Getter String segmentId;
    private @Getter String cabin;
    private @Getter String fareBasis;
    private @Getter String brandedFare;
    @SerializedName("class")
    private @Getter String segmentClass;
    private @Getter boolean isAllotment;
    private @Getter AllotmentDetails allotmentDetails;
    private @Getter String sliceDiceIndicator;
    private @Getter BaggageAllowance includedCheckedBags;
    private @Getter AdditionalServiceRequest additionalServices;
    private @Getter Amenity[] amenities;

    protected FareDetailsBySegment() {}
  }

  @ToString
  public static class AllotmentDetails {
    private @Getter String tourName;
    private @Getter String tourReference;

    protected AllotmentDetails() {}
  }

  @ToString
  public static class BaggageAllowance {
    private @Getter int quantity;
    private @Getter int weight;
    private @Getter String weightUnit;

    protected BaggageAllowance() {}
  }

  @ToString
  public static class AdditionalServiceRequest {
    private @Getter BaggageAllowance chargeableCheckedBags;
    private @Getter String chargeableSeatNumber;
    private @Getter String[] otherServices;

    protected AdditionalServiceRequest() {}
  }

  @ToString
  public static class Amenity {
    private @Getter String code;
    private @Getter String description;
    private @Getter Boolean isChargeable;
    private @Getter String amenityType;

    protected Amenity() {}
  }

  @ToString
  public static class FareRules {
    private @Getter String currency;
    private @Getter TermAndCondition[] rules;

    protected FareRules() {}
  }

  @ToString
  public static class TermAndCondition {
    private @Getter String category;
    private @Getter String circumstances;
    private @Getter boolean notApplicable;
    private @Getter String maxPenaltyAmount;
    private @Getter Description[] descriptions;

    protected TermAndCondition() {}
  }

  @ToString
  public static class Description {
    private @Getter String descriptionType;
    private @Getter String text;

    protected Description() {}
  }
}
