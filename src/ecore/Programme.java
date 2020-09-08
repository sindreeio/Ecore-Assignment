/**
 */
package ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.Programme#getName <em>Name</em>}</li>
 *   <li>{@link ecore.Programme#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link ecore.Programme#getSemesterInProgramme <em>Semester In Programme</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NotTooManyMandatoryPoints'"
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecore.EcorePackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecore.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.Specialisation}.
	 * It is bidirectional and its opposite is '{@link ecore.Specialisation#getSpecialisationInProgramme <em>Specialisation In Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' containment reference list.
	 * @see ecore.EcorePackage#getProgramme_Specialisations()
	 * @see ecore.Specialisation#getSpecialisationInProgramme
	 * @model opposite="SpecialisationInProgramme" containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecialisations();

	/**
	 * Returns the value of the '<em><b>Semester In Programme</b></em>' reference list.
	 * The list contents are of type {@link ecore.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester In Programme</em>' reference list.
	 * @see ecore.EcorePackage#getProgramme_SemesterInProgramme()
	 * @model
	 * @generated
	 */
	EList<Semester> getSemesterInProgramme();

} // Programme
