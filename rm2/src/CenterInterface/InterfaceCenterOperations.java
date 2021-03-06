package CenterInterface;


/**
* CenterInterface/InterfaceCenterOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from InterfaceMTL.idl
* Saturday, July 29, 2017 9:41:06 PM EDT
*/

public interface InterfaceCenterOperations 
{
  String createTRecord (String mi, String fn, String ln, String ad, String ph, String sp, String lo);
  String createSRecord (String mi, String fn, String ln, boolean s, String[] CourseRegistered);
  String getRecordCounts (String mi);
  String editRecord (String mi, String recordID, String fieldname, String[] newvalue);
  void StransferRecord (String site, byte[] record, String rid, String mi, String fromN);
  String MtransferRecord (String mid, String rid, String remoteName);
  void register (CenterInterface.InterfaceCenter ifc, int infoNo);
} // interface InterfaceCenterOperations
