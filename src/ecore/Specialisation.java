/**
 */
package ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.Specialisation#getSpecialisationInProgramme <em>Specialisation In Programme</em>}</li>
 *   <li>{@link ecore.Specialisation#getCourseInSemester <em>Course In Semester</em>}</li>
 *   <li>{@link ecore.Specialisation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getSpecialisation()
 * @model
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Specialisation In Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation In Programme</em>' reference.
	 * @see #setSpecialisationInProgramme(Programme)
	 * @see ecore.EcorePackage#getSpecialisation_SpecialisationInProgramme()
	 * @model required="true"
	 * @generated
	 */
	Programme getSpecialisationInProgramme();

	/**
	 * Sets the value of the '{@link ecore.Specialisation#getSpecialisationInProgramme <em>Specialisation In Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation In Programme</em>' reference.
	 * @see #getSpecialisationInProgramme()
	 * @generated
	 */
	void setSpecialisationInProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Course In Semester</b></em>' reference list.
	 * The list contents are of type {@link ecore.courseInSemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course In Semester</em>' reference list.
	 * @see ecore.EcorePackage#getSpecialisation_CourseInSemester()
	 * @model
	 * @generated
	 */
	EList<courseInSemester> getCourseInSemester();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecore.EcorePackage#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecore.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Specialisation
